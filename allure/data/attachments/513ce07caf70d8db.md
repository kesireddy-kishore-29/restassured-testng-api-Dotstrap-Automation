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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-bd2646eb-4bbe-4d7d-b2c9-0445974c0cfe` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-d18f363e-e74b-40b3-a2d8-c461f65df91e` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 17 | `qa-8bff5e34-c0b1-4ca0-a772-b0a653d35813` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6eccd36c-72d4-4d30-a530-8b3ccdb370ee` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-18fd930c-77cc-409a-a11e-2c6246e49a7d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd2646eb-4bbe-4d7d-b2c9-0445974c0cfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd2646eb-4bbe-4d7d-b2c9-0445974c0cfe
Content-Type: application/json

--- request body ---
{"handle":"qa-9a19cf918b05","displayName":"QA 9a19cf918b05","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd2646eb-4bbe-4d7d-b2c9-0445974c0cfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Location: /v1/accounts/qa-9a19cf918b05
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f8956f0-6944-4cb2-9eb2-f601da962619","handle":"qa-9a19cf918b05","displayName":"QA 9a19cf918b05","region":"eu","role":"user","createdAt":"2026-11-28T10:37:26.214935559Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d18f363e-e74b-40b3-a2d8-c461f65df91e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d18f363e-e74b-40b3-a2d8-c461f65df91e
Content-Type: application/json

--- request body ---
{"handle":"qa-9a19cf918b05","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d18f363e-e74b-40b3-a2d8-c461f65df91e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f8956f0-6944-4cb2-9eb2-f601da962619"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-8bff5e34-c0b1-4ca0-a772-b0a653d35813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bff5e34-c0b1-4ca0-a772-b0a653d35813
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bff5e34-c0b1-4ca0-a772-b0a653d35813
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-8bff5e34-c0b1-4ca0-a772-b0a653d35813"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6eccd36c-72d4-4d30-a530-8b3ccdb370ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eccd36c-72d4-4d30-a530-8b3ccdb370ee
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6eccd36c-72d4-4d30-a530-8b3ccdb370ee
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
correlation: qa-18fd930c-77cc-409a-a11e-2c6246e49a7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18fd930c-77cc-409a-a11e-2c6246e49a7d
Content-Type: application/json

--- request body ---
{"handle":"qa-9a19cf918b05","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18fd930c-77cc-409a-a11e-2c6246e49a7d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18fd930c-77cc-409a-a11e-2c6246e49a7d"}
```
