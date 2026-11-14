# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-2f7f6ab0-73e5-4430-8da9-fc6f459174ea` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-1dfed0f9-75bb-40c1-be35-ee1ea3e7e8ad` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 10 | `qa-65348534-7b73-4847-8389-f8161c0d0e03` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-5b86308b-abb4-4c0d-b75c-7fd510f01423` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-5e6683c3-de1a-4968-95b3-51389215fa1f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2f7f6ab0-73e5-4430-8da9-fc6f459174ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f7f6ab0-73e5-4430-8da9-fc6f459174ea
Content-Type: application/json

--- request body ---
{"handle":"qa-69bc27f59dae","displayName":"QA 69bc27f59dae","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f7f6ab0-73e5-4430-8da9-fc6f459174ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Location: /v1/accounts/qa-69bc27f59dae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c2c57fd-521b-4b11-8a3d-4ecc6dd55643","handle":"qa-69bc27f59dae","displayName":"QA 69bc27f59dae","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.428164956Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1dfed0f9-75bb-40c1-be35-ee1ea3e7e8ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dfed0f9-75bb-40c1-be35-ee1ea3e7e8ad
Content-Type: application/json

--- request body ---
{"handle":"qa-69bc27f59dae","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dfed0f9-75bb-40c1-be35-ee1ea3e7e8ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c2c57fd-521b-4b11-8a3d-4ecc6dd55643"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-65348534-7b73-4847-8389-f8161c0d0e03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65348534-7b73-4847-8389-f8161c0d0e03
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65348534-7b73-4847-8389-f8161c0d0e03
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-65348534-7b73-4847-8389-f8161c0d0e03"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b86308b-abb4-4c0d-b75c-7fd510f01423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b86308b-abb4-4c0d-b75c-7fd510f01423
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b86308b-abb4-4c0d-b75c-7fd510f01423
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
correlation: qa-5e6683c3-de1a-4968-95b3-51389215fa1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e6683c3-de1a-4968-95b3-51389215fa1f
Content-Type: application/json

--- request body ---
{"handle":"qa-69bc27f59dae","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e6683c3-de1a-4968-95b3-51389215fa1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e6683c3-de1a-4968-95b3-51389215fa1f"}
```
