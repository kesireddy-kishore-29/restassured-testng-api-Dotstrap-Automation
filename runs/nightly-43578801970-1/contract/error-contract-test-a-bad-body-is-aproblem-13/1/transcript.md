# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-2836410d-3b04-49af-af22-54ff8cb57387` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-57a570c3-9716-4dbe-843b-8967a5c8c373` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-12969315-4fd2-4b9c-b22b-3f2e4be53c72` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-25c76a97-61c2-4138-9efa-c6fa7f36a6bf` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 24 | `qa-113483e6-f002-4927-8922-32a2d224df4b` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-7ac5ff42-474a-4a5e-8bfe-fc8cf49bee53` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0e29dc9b-3cca-4d30-ae64-c7ae490c0151` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-caccfb01-efd0-40ac-a07f-8806cae5f829` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-34af67c0-0713-47cc-8e73-84c6a6e0e673` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-e4ab8390-f88b-4435-add7-ad5474541466` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2836410d-3b04-49af-af22-54ff8cb57387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2836410d-3b04-49af-af22-54ff8cb57387
Content-Type: application/json

--- request body ---
{"handle":"qa-5020f91d361e","displayName":"QA 5020f91d361e","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2836410d-3b04-49af-af22-54ff8cb57387
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Location: /v1/accounts/qa-5020f91d361e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28bf2ac4-7987-4af2-a815-a122c986b574","handle":"qa-5020f91d361e","displayName":"QA 5020f91d361e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.310136941Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-57a570c3-9716-4dbe-843b-8967a5c8c373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a570c3-9716-4dbe-843b-8967a5c8c373
Content-Type: application/json

--- request body ---
{"handle":"qa-594da5fbe114","displayName":"QA 594da5fbe114","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-57a570c3-9716-4dbe-843b-8967a5c8c373
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-594da5fbe114
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e02f124-2d1c-4619-8bff-874019b32209","handle":"qa-594da5fbe114","displayName":"QA 594da5fbe114","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.347732659Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-12969315-4fd2-4b9c-b22b-3f2e4be53c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12969315-4fd2-4b9c-b22b-3f2e4be53c72
Content-Type: application/json

--- request body ---
{"handle":"qa-5020f91d361e","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-12969315-4fd2-4b9c-b22b-3f2e4be53c72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28bf2ac4-7987-4af2-a815-a122c986b574"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-25c76a97-61c2-4138-9efa-c6fa7f36a6bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c76a97-61c2-4138-9efa-c6fa7f36a6bf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-594da5fbe114","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-25c76a97-61c2-4138-9efa-c6fa7f36a6bf
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
Location: /v1/conversations/cnv_823ad0cc-738a-4c73-86f4-51dee63eb793
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_823ad0cc-738a-4c73-86f4-51dee63eb793","subject":"Error contract","status":"open","region":"eu","participants":["qa-5020f91d361e","qa-594da5fbe114"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.441916982Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_823ad0cc-738a-4c73-86f4-51dee63eb793/messages
correlation: qa-113483e6-f002-4927-8922-32a2d224df4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-113483e6-f002-4927-8922-32a2d224df4b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-113483e6-f002-4927-8922-32a2d224df4b
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_823ad0cc-738a-4c73-86f4-51dee63eb793/messages","correlationId":"qa-113483e6-f002-4927-8922-32a2d224df4b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7ac5ff42-474a-4a5e-8bfe-fc8cf49bee53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac5ff42-474a-4a5e-8bfe-fc8cf49bee53
Content-Type: application/json

--- request body ---
{"handle":"qa-594da5fbe114","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ac5ff42-474a-4a5e-8bfe-fc8cf49bee53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e02f124-2d1c-4619-8bff-874019b32209"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e29dc9b-3cca-4d30-ae64-c7ae490c0151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e29dc9b-3cca-4d30-ae64-c7ae490c0151
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e29dc9b-3cca-4d30-ae64-c7ae490c0151
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-caccfb01-efd0-40ac-a07f-8806cae5f829

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caccfb01-efd0-40ac-a07f-8806cae5f829
Content-Type: application/json

--- request body ---
{"handle":"qa-594da5fbe114","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-caccfb01-efd0-40ac-a07f-8806cae5f829
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-caccfb01-efd0-40ac-a07f-8806cae5f829"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34af67c0-0713-47cc-8e73-84c6a6e0e673

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34af67c0-0713-47cc-8e73-84c6a6e0e673
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34af67c0-0713-47cc-8e73-84c6a6e0e673
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e4ab8390-f88b-4435-add7-ad5474541466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4ab8390-f88b-4435-add7-ad5474541466
Content-Type: application/json

--- request body ---
{"handle":"qa-5020f91d361e","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4ab8390-f88b-4435-add7-ad5474541466
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4ab8390-f88b-4435-add7-ad5474541466"}
```
