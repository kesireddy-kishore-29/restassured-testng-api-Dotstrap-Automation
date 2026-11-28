# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-f1983884-478a-49a3-9398-0b7a279f8d72` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-50729f46-91f4-45c9-b35a-581a5bf3bd5f` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-c7161442-7706-4687-953c-4b554e9a92ae` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-ab5b2216-8f36-4a42-9d64-9356aad59793` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 40 | `qa-14d8ea9c-8c66-400b-a099-4996ca051bd1` |
| 6 | `POST /v1/auth/token` | 200 | 107 | `qa-3813b1d2-afd9-4656-b9bc-976b4bdc3577` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-849ab3b4-cf9f-4d7d-8190-1f290153dd50` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-fe903ade-c079-4546-a4b1-03f27470960e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-5a09ae1c-a339-4e69-9a88-d7877255c708` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-0dbd4a30-1660-4361-bc0b-ad097e24df10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1983884-478a-49a3-9398-0b7a279f8d72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1983884-478a-49a3-9398-0b7a279f8d72
Content-Type: application/json

--- request body ---
{"handle":"qa-e45c65bcb8dc","displayName":"QA e45c65bcb8dc","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1983884-478a-49a3-9398-0b7a279f8d72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 6
Location: /v1/accounts/qa-e45c65bcb8dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cc84a5e-a0c4-42f3-8428-9ba199cb0fcb","handle":"qa-e45c65bcb8dc","displayName":"QA e45c65bcb8dc","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.629480561Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50729f46-91f4-45c9-b35a-581a5bf3bd5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50729f46-91f4-45c9-b35a-581a5bf3bd5f
Content-Type: application/json

--- request body ---
{"handle":"qa-ceee275c01e2","displayName":"QA ceee275c01e2","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-50729f46-91f4-45c9-b35a-581a5bf3bd5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 6
Location: /v1/accounts/qa-ceee275c01e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a5323523-3a2c-4f14-bc92-14d8880f730b","handle":"qa-ceee275c01e2","displayName":"QA ceee275c01e2","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.694419657Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c7161442-7706-4687-953c-4b554e9a92ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7161442-7706-4687-953c-4b554e9a92ae
Content-Type: application/json

--- request body ---
{"handle":"qa-e45c65bcb8dc","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7161442-7706-4687-953c-4b554e9a92ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cc84a5e-a0c4-42f3-8428-9ba199cb0fcb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ab5b2216-8f36-4a42-9d64-9356aad59793

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab5b2216-8f36-4a42-9d64-9356aad59793
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ceee275c01e2","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab5b2216-8f36-4a42-9d64-9356aad59793
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
Location: /v1/conversations/cnv_527ec4c2-bfc2-4210-9fc6-614fe144e58b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_527ec4c2-bfc2-4210-9fc6-614fe144e58b","subject":"Error contract","status":"open","region":"eu","participants":["qa-e45c65bcb8dc","qa-ceee275c01e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.832758840Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_527ec4c2-bfc2-4210-9fc6-614fe144e58b/messages
correlation: qa-14d8ea9c-8c66-400b-a099-4996ca051bd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d8ea9c-8c66-400b-a099-4996ca051bd1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14d8ea9c-8c66-400b-a099-4996ca051bd1
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_527ec4c2-bfc2-4210-9fc6-614fe144e58b/messages","correlationId":"qa-14d8ea9c-8c66-400b-a099-4996ca051bd1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3813b1d2-afd9-4656-b9bc-976b4bdc3577

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3813b1d2-afd9-4656-b9bc-976b4bdc3577
Content-Type: application/json

--- request body ---
{"handle":"qa-ceee275c01e2","password":"****"}

--- response: 200 in 107 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3813b1d2-afd9-4656-b9bc-976b4bdc3577
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a5323523-3a2c-4f14-bc92-14d8880f730b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-849ab3b4-cf9f-4d7d-8190-1f290153dd50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-849ab3b4-cf9f-4d7d-8190-1f290153dd50
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-849ab3b4-cf9f-4d7d-8190-1f290153dd50
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
correlation: qa-fe903ade-c079-4546-a4b1-03f27470960e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe903ade-c079-4546-a4b1-03f27470960e
Content-Type: application/json

--- request body ---
{"handle":"qa-ceee275c01e2","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe903ade-c079-4546-a4b1-03f27470960e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe903ade-c079-4546-a4b1-03f27470960e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a09ae1c-a339-4e69-9a88-d7877255c708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a09ae1c-a339-4e69-9a88-d7877255c708
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a09ae1c-a339-4e69-9a88-d7877255c708
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
correlation: qa-0dbd4a30-1660-4361-bc0b-ad097e24df10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dbd4a30-1660-4361-bc0b-ad097e24df10
Content-Type: application/json

--- request body ---
{"handle":"qa-e45c65bcb8dc","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dbd4a30-1660-4361-bc0b-ad097e24df10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0dbd4a30-1660-4361-bc0b-ad097e24df10"}
```
