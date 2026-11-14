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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-1cd913a4-b8ad-4b72-808b-f149706e54a3` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-042b6a5a-5830-4dca-b060-eac602d20b4e` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 2 | `qa-09e30e22-5c4b-47df-aa70-257d822f5caf` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c45d529b-3561-4780-9f72-2060b6704925` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-23592ba0-29d0-4af2-81ee-52c1d06bf395` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1cd913a4-b8ad-4b72-808b-f149706e54a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cd913a4-b8ad-4b72-808b-f149706e54a3
Content-Type: application/json

--- request body ---
{"handle":"qa-10dec25610aa","displayName":"QA 10dec25610aa","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cd913a4-b8ad-4b72-808b-f149706e54a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 8
Location: /v1/accounts/qa-10dec25610aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5536749d-273d-4d57-adc9-a2d7bbe33921","handle":"qa-10dec25610aa","displayName":"QA 10dec25610aa","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.865549282Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-042b6a5a-5830-4dca-b060-eac602d20b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-042b6a5a-5830-4dca-b060-eac602d20b4e
Content-Type: application/json

--- request body ---
{"handle":"qa-10dec25610aa","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-042b6a5a-5830-4dca-b060-eac602d20b4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5536749d-273d-4d57-adc9-a2d7bbe33921"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-09e30e22-5c4b-47df-aa70-257d822f5caf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e30e22-5c4b-47df-aa70-257d822f5caf
Content-Type: application/json

--- response: 404 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09e30e22-5c4b-47df-aa70-257d822f5caf
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-09e30e22-5c4b-47df-aa70-257d822f5caf"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c45d529b-3561-4780-9f72-2060b6704925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c45d529b-3561-4780-9f72-2060b6704925
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c45d529b-3561-4780-9f72-2060b6704925
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
correlation: qa-23592ba0-29d0-4af2-81ee-52c1d06bf395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23592ba0-29d0-4af2-81ee-52c1d06bf395
Content-Type: application/json

--- request body ---
{"handle":"qa-10dec25610aa","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23592ba0-29d0-4af2-81ee-52c1d06bf395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23592ba0-29d0-4af2-81ee-52c1d06bf395"}
```
