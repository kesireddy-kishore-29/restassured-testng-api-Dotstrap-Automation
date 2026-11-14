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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-3bb84549-283f-4787-8157-de9f1cc5089c` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-dfd073de-af04-4e73-ad8d-b1e9c8d2a23e` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 4 | `qa-c24f1acc-0958-432f-8ca5-133a7cfe423d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-668d08a4-127a-4760-b3b6-31efde4cdbb5` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-f6536d5a-ca24-4d4b-a612-9108b686dbb5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3bb84549-283f-4787-8157-de9f1cc5089c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bb84549-283f-4787-8157-de9f1cc5089c
Content-Type: application/json

--- request body ---
{"handle":"qa-01b2c6e4cd92","displayName":"QA 01b2c6e4cd92","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bb84549-283f-4787-8157-de9f1cc5089c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-01b2c6e4cd92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a77e6312-88e7-4569-8049-fd01eff4eba4","handle":"qa-01b2c6e4cd92","displayName":"QA 01b2c6e4cd92","region":"eu","role":"user","createdAt":"2026-11-09T09:56:04.166278044Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dfd073de-af04-4e73-ad8d-b1e9c8d2a23e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfd073de-af04-4e73-ad8d-b1e9c8d2a23e
Content-Type: application/json

--- request body ---
{"handle":"qa-01b2c6e4cd92","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfd073de-af04-4e73-ad8d-b1e9c8d2a23e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a77e6312-88e7-4569-8049-fd01eff4eba4"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-c24f1acc-0958-432f-8ca5-133a7cfe423d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c24f1acc-0958-432f-8ca5-133a7cfe423d
Content-Type: application/json

--- response: 404 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c24f1acc-0958-432f-8ca5-133a7cfe423d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-c24f1acc-0958-432f-8ca5-133a7cfe423d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-668d08a4-127a-4760-b3b6-31efde4cdbb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-668d08a4-127a-4760-b3b6-31efde4cdbb5
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-668d08a4-127a-4760-b3b6-31efde4cdbb5
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
correlation: qa-f6536d5a-ca24-4d4b-a612-9108b686dbb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6536d5a-ca24-4d4b-a612-9108b686dbb5
Content-Type: application/json

--- request body ---
{"handle":"qa-01b2c6e4cd92","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6536d5a-ca24-4d4b-a612-9108b686dbb5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6536d5a-ca24-4d4b-a612-9108b686dbb5"}
```
