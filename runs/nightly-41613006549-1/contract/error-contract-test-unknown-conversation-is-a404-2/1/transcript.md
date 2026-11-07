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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-b5ddb493-fffa-496d-ab4b-7e76990b9ca0` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-4930975e-2186-453e-9278-8576ef441a98` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 18 | `qa-9bbc57d1-6ab2-4c8b-89a4-039e0b5dcedd` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b18bdb2f-856b-4d94-a830-6976b6e446b8` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-9f5d0399-4165-43ef-9a02-c1c9059aa681` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5ddb493-fffa-496d-ab4b-7e76990b9ca0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ddb493-fffa-496d-ab4b-7e76990b9ca0
Content-Type: application/json

--- request body ---
{"handle":"qa-50ac4eeddb3e","displayName":"QA 50ac4eeddb3e","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5ddb493-fffa-496d-ab4b-7e76990b9ca0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 8
Location: /v1/accounts/qa-50ac4eeddb3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f39665d8-ce14-4538-b394-227b8884bed2","handle":"qa-50ac4eeddb3e","displayName":"QA 50ac4eeddb3e","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.740443169Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4930975e-2186-453e-9278-8576ef441a98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4930975e-2186-453e-9278-8576ef441a98
Content-Type: application/json

--- request body ---
{"handle":"qa-50ac4eeddb3e","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4930975e-2186-453e-9278-8576ef441a98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f39665d8-ce14-4538-b394-227b8884bed2"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-9bbc57d1-6ab2-4c8b-89a4-039e0b5dcedd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bbc57d1-6ab2-4c8b-89a4-039e0b5dcedd
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bbc57d1-6ab2-4c8b-89a4-039e0b5dcedd
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-9bbc57d1-6ab2-4c8b-89a4-039e0b5dcedd"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b18bdb2f-856b-4d94-a830-6976b6e446b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18bdb2f-856b-4d94-a830-6976b6e446b8
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b18bdb2f-856b-4d94-a830-6976b6e446b8
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
correlation: qa-9f5d0399-4165-43ef-9a02-c1c9059aa681

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5d0399-4165-43ef-9a02-c1c9059aa681
Content-Type: application/json

--- request body ---
{"handle":"qa-50ac4eeddb3e","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f5d0399-4165-43ef-9a02-c1c9059aa681
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f5d0399-4165-43ef-9a02-c1c9059aa681"}
```
