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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-f792041d-e22e-4899-b036-55b284595083` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-e00fd0db-28fd-4ec6-89b9-a268058a1376` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 12 | `qa-4b905a97-1a8c-4148-9ad2-5b53b2300185` |
| 4 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-4c9c7a47-b304-43f7-8357-e570a7d3c09f` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-2115ffd2-763c-402a-82b3-c973d8834375` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f792041d-e22e-4899-b036-55b284595083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f792041d-e22e-4899-b036-55b284595083
Content-Type: application/json

--- request body ---
{"handle":"qa-8f5312dd4689","displayName":"QA 8f5312dd4689","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f792041d-e22e-4899-b036-55b284595083
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Location: /v1/accounts/qa-8f5312dd4689
X-Served-Region: eu
Content-Length: 181

{"id":"acc_772bafd1-a079-46e3-b924-899a16c5bfa5","handle":"qa-8f5312dd4689","displayName":"QA 8f5312dd4689","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.423177995Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e00fd0db-28fd-4ec6-89b9-a268058a1376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e00fd0db-28fd-4ec6-89b9-a268058a1376
Content-Type: application/json

--- request body ---
{"handle":"qa-8f5312dd4689","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e00fd0db-28fd-4ec6-89b9-a268058a1376
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_772bafd1-a079-46e3-b924-899a16c5bfa5"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-4b905a97-1a8c-4148-9ad2-5b53b2300185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b905a97-1a8c-4148-9ad2-5b53b2300185
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b905a97-1a8c-4148-9ad2-5b53b2300185
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-4b905a97-1a8c-4148-9ad2-5b53b2300185"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c9c7a47-b304-43f7-8357-e570a7d3c09f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c9c7a47-b304-43f7-8357-e570a7d3c09f
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c9c7a47-b304-43f7-8357-e570a7d3c09f
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
correlation: qa-2115ffd2-763c-402a-82b3-c973d8834375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2115ffd2-763c-402a-82b3-c973d8834375
Content-Type: application/json

--- request body ---
{"handle":"qa-8f5312dd4689","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2115ffd2-763c-402a-82b3-c973d8834375
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2115ffd2-763c-402a-82b3-c973d8834375"}
```
