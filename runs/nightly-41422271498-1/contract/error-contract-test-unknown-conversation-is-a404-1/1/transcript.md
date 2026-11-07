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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-ca3a3ebd-4d4a-4fdf-b684-3292a27d9e12` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-f1cb0b5e-a2b6-4c15-a1f3-0eaf040ebb1f` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 17 | `qa-1fb4726c-846e-4ec8-98e1-aaa71bcf14ac` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-fb4542ab-166c-482e-8de2-a8caf87b27b2` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-9f1aca7a-e15a-4d72-91e6-05e01e61c739` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca3a3ebd-4d4a-4fdf-b684-3292a27d9e12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca3a3ebd-4d4a-4fdf-b684-3292a27d9e12
Content-Type: application/json

--- request body ---
{"handle":"qa-6ebe66f0e03f","displayName":"QA 6ebe66f0e03f","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca3a3ebd-4d4a-4fdf-b684-3292a27d9e12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Location: /v1/accounts/qa-6ebe66f0e03f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9a9607e-eb6f-45f5-b102-edac92919933","handle":"qa-6ebe66f0e03f","displayName":"QA 6ebe66f0e03f","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.957368543Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f1cb0b5e-a2b6-4c15-a1f3-0eaf040ebb1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1cb0b5e-a2b6-4c15-a1f3-0eaf040ebb1f
Content-Type: application/json

--- request body ---
{"handle":"qa-6ebe66f0e03f","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1cb0b5e-a2b6-4c15-a1f3-0eaf040ebb1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9a9607e-eb6f-45f5-b102-edac92919933"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-1fb4726c-846e-4ec8-98e1-aaa71bcf14ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fb4726c-846e-4ec8-98e1-aaa71bcf14ac
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1fb4726c-846e-4ec8-98e1-aaa71bcf14ac
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-1fb4726c-846e-4ec8-98e1-aaa71bcf14ac"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb4542ab-166c-482e-8de2-a8caf87b27b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb4542ab-166c-482e-8de2-a8caf87b27b2
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb4542ab-166c-482e-8de2-a8caf87b27b2
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
correlation: qa-9f1aca7a-e15a-4d72-91e6-05e01e61c739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f1aca7a-e15a-4d72-91e6-05e01e61c739
Content-Type: application/json

--- request body ---
{"handle":"qa-6ebe66f0e03f","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f1aca7a-e15a-4d72-91e6-05e01e61c739
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f1aca7a-e15a-4d72-91e6-05e01e61c739"}
```
