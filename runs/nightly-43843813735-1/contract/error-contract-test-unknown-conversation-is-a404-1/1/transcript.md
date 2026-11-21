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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-6728e968-a8a1-4d47-9f77-009c0bb6d249` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-534c6d13-80a0-4fb7-913e-9919680a5980` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 35 | `qa-5d43a138-645b-40d9-9ade-f72ba412677f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-56018489-da9b-4fec-8390-b3521ddec3dd` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-b96afe7c-59e6-4837-9480-e32f50378a11` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6728e968-a8a1-4d47-9f77-009c0bb6d249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6728e968-a8a1-4d47-9f77-009c0bb6d249
Content-Type: application/json

--- request body ---
{"handle":"qa-aa24003124c1","displayName":"QA aa24003124c1","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-6728e968-a8a1-4d47-9f77-009c0bb6d249
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Location: /v1/accounts/qa-aa24003124c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2561c426-b8a9-4746-8f5e-7218867055d4","handle":"qa-aa24003124c1","displayName":"QA aa24003124c1","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.814639903Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-534c6d13-80a0-4fb7-913e-9919680a5980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-534c6d13-80a0-4fb7-913e-9919680a5980
Content-Type: application/json

--- request body ---
{"handle":"qa-aa24003124c1","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-534c6d13-80a0-4fb7-913e-9919680a5980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2561c426-b8a9-4746-8f5e-7218867055d4"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-5d43a138-645b-40d9-9ade-f72ba412677f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d43a138-645b-40d9-9ade-f72ba412677f
Content-Type: application/json

--- response: 404 in 35 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d43a138-645b-40d9-9ade-f72ba412677f
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-5d43a138-645b-40d9-9ade-f72ba412677f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56018489-da9b-4fec-8390-b3521ddec3dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56018489-da9b-4fec-8390-b3521ddec3dd
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56018489-da9b-4fec-8390-b3521ddec3dd
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
correlation: qa-b96afe7c-59e6-4837-9480-e32f50378a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b96afe7c-59e6-4837-9480-e32f50378a11
Content-Type: application/json

--- request body ---
{"handle":"qa-aa24003124c1","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b96afe7c-59e6-4837-9480-e32f50378a11
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b96afe7c-59e6-4837-9480-e32f50378a11"}
```
