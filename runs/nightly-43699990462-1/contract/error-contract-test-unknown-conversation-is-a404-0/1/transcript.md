# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-3cfb3120-c8f9-4df2-ac79-9ef09db78ff1` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-e75f3cc3-0b5a-44b5-b6b2-23d9b1aa7f98` |
| 3 | `GET /v1/conversations/{id}` | 404 | 6 | `qa-6fb64de9-81bb-4db0-adbe-843012517fc6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a5f24bfa-a0be-48e7-a9a8-ea274f0482b0` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-29cd5f12-833e-4eda-ab03-b35724a9619b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3cfb3120-c8f9-4df2-ac79-9ef09db78ff1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cfb3120-c8f9-4df2-ac79-9ef09db78ff1
Content-Type: application/json

--- request body ---
{"handle":"qa-4763773679e6","displayName":"QA 4763773679e6","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cfb3120-c8f9-4df2-ac79-9ef09db78ff1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Location: /v1/accounts/qa-4763773679e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ef7aaa09-4290-48dd-94ab-07d242d778ac","handle":"qa-4763773679e6","displayName":"QA 4763773679e6","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.842553689Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e75f3cc3-0b5a-44b5-b6b2-23d9b1aa7f98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e75f3cc3-0b5a-44b5-b6b2-23d9b1aa7f98
Content-Type: application/json

--- request body ---
{"handle":"qa-4763773679e6","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e75f3cc3-0b5a-44b5-b6b2-23d9b1aa7f98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef7aaa09-4290-48dd-94ab-07d242d778ac"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-6fb64de9-81bb-4db0-adbe-843012517fc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fb64de9-81bb-4db0-adbe-843012517fc6
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fb64de9-81bb-4db0-adbe-843012517fc6
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-6fb64de9-81bb-4db0-adbe-843012517fc6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5f24bfa-a0be-48e7-a9a8-ea274f0482b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5f24bfa-a0be-48e7-a9a8-ea274f0482b0
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5f24bfa-a0be-48e7-a9a8-ea274f0482b0
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
correlation: qa-29cd5f12-833e-4eda-ab03-b35724a9619b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29cd5f12-833e-4eda-ab03-b35724a9619b
Content-Type: application/json

--- request body ---
{"handle":"qa-4763773679e6","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29cd5f12-833e-4eda-ab03-b35724a9619b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29cd5f12-833e-4eda-ab03-b35724a9619b"}
```
