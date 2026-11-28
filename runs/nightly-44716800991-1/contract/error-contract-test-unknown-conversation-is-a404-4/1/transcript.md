# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-06310058-ccc5-47e2-96d1-fedfeb493df9` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-a4d49573-c4d2-492a-8647-cc86c41836be` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 8 | `qa-487ab745-fe36-494e-8ec7-55f08fcd7dad` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1ceedab0-53c2-40b0-b59a-10b9ee1ec1ce` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-93e99569-7e80-4ca6-bda0-2dfe2bf97973` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-06310058-ccc5-47e2-96d1-fedfeb493df9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06310058-ccc5-47e2-96d1-fedfeb493df9
Content-Type: application/json

--- request body ---
{"handle":"qa-8f8fcbf08d2a","displayName":"QA 8f8fcbf08d2a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-06310058-ccc5-47e2-96d1-fedfeb493df9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Location: /v1/accounts/qa-8f8fcbf08d2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38643df9-49c4-4be2-b0ae-905526d102a1","handle":"qa-8f8fcbf08d2a","displayName":"QA 8f8fcbf08d2a","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.378220903Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a4d49573-c4d2-492a-8647-cc86c41836be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d49573-c4d2-492a-8647-cc86c41836be
Content-Type: application/json

--- request body ---
{"handle":"qa-8f8fcbf08d2a","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4d49573-c4d2-492a-8647-cc86c41836be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38643df9-49c4-4be2-b0ae-905526d102a1"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-487ab745-fe36-494e-8ec7-55f08fcd7dad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-487ab745-fe36-494e-8ec7-55f08fcd7dad
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-487ab745-fe36-494e-8ec7-55f08fcd7dad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-487ab745-fe36-494e-8ec7-55f08fcd7dad"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ceedab0-53c2-40b0-b59a-10b9ee1ec1ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ceedab0-53c2-40b0-b59a-10b9ee1ec1ce
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ceedab0-53c2-40b0-b59a-10b9ee1ec1ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-93e99569-7e80-4ca6-bda0-2dfe2bf97973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e99569-7e80-4ca6-bda0-2dfe2bf97973
Content-Type: application/json

--- request body ---
{"handle":"qa-8f8fcbf08d2a","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93e99569-7e80-4ca6-bda0-2dfe2bf97973
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93e99569-7e80-4ca6-bda0-2dfe2bf97973"}
```
