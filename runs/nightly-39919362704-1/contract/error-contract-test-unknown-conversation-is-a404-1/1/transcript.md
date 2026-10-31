# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-378dca12-e9fb-4c4d-be95-aa4d1a9bc68b` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-13f4d1ab-479a-48f3-9d50-fbe054f4fb5a` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 20 | `qa-8c605600-4657-446c-b140-06df14c639fb` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e7104b4c-3381-472a-8fbe-778459902fa0` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-35c936b9-a817-49b8-900a-fde959130bdd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-378dca12-e9fb-4c4d-be95-aa4d1a9bc68b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378dca12-e9fb-4c4d-be95-aa4d1a9bc68b
Content-Type: application/json

--- request body ---
{"handle":"qa-e8b962493328","displayName":"QA e8b962493328","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-378dca12-e9fb-4c4d-be95-aa4d1a9bc68b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 5
Location: /v1/accounts/qa-e8b962493328
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63233e19-6de2-4c69-8130-447c426098c2","handle":"qa-e8b962493328","displayName":"QA e8b962493328","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.676829915Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-13f4d1ab-479a-48f3-9d50-fbe054f4fb5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13f4d1ab-479a-48f3-9d50-fbe054f4fb5a
Content-Type: application/json

--- request body ---
{"handle":"qa-e8b962493328","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-13f4d1ab-479a-48f3-9d50-fbe054f4fb5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63233e19-6de2-4c69-8130-447c426098c2"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-8c605600-4657-446c-b140-06df14c639fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c605600-4657-446c-b140-06df14c639fb
Content-Type: application/json

--- response: 404 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c605600-4657-446c-b140-06df14c639fb
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-8c605600-4657-446c-b140-06df14c639fb"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7104b4c-3381-472a-8fbe-778459902fa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7104b4c-3381-472a-8fbe-778459902fa0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7104b4c-3381-472a-8fbe-778459902fa0
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
correlation: qa-35c936b9-a817-49b8-900a-fde959130bdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c936b9-a817-49b8-900a-fde959130bdd
Content-Type: application/json

--- request body ---
{"handle":"qa-e8b962493328","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35c936b9-a817-49b8-900a-fde959130bdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35c936b9-a817-49b8-900a-fde959130bdd"}
```
