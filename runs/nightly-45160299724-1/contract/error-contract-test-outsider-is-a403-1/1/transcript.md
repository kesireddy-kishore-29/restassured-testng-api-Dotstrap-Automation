# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-4235d4e7-5b27-426f-993b-dac0bcef92cf` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-ded1c20b-ba1e-46a9-9ee9-bb9394ad004f` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-6620dc0c-2d43-4e04-a3f0-6bdefd79a929` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-daaaa515-7d05-4879-ba34-73270af0ab61` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-91bb1f77-bef3-4d9a-9e8a-dc045bfc4cb3` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-27c922c3-b76f-41f5-97a1-4eb777250d79` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 20 | `qa-af25608e-b755-4f9f-952c-da6d9dc35381` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-81f48dc6-5fd9-4b4a-ad1b-3a10696a7a15` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-46307e7e-700c-42b8-8a6e-885b7dc8d2b1` |
| 10 | `POST /v1/auth/token` | 200 | 29 | `qa-cebe9dd5-eb80-4cbb-ae67-d95c7b8a5841` |
| 11 | `DELETE /v1/accounts/me` | 204 | 53 | `qa-4e44ba9a-b13e-48ac-a77a-e9b6d1a521ac` |
| 12 | `POST /v1/auth/token` | 401 | 11 | `qa-7a5e6204-c854-4cdf-bff9-ac43bbc64396` |
| 13 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-51bee8d7-e45d-49aa-a011-90de64c15388` |
| 14 | `POST /v1/auth/token` | 401 | 30 | `qa-aca03219-4f08-4cd6-bc61-f875b8ffd9b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4235d4e7-5b27-426f-993b-dac0bcef92cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4235d4e7-5b27-426f-993b-dac0bcef92cf
Content-Type: application/json

--- request body ---
{"handle":"qa-cd67fa554932","displayName":"QA cd67fa554932","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4235d4e7-5b27-426f-993b-dac0bcef92cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-cd67fa554932
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47d4d5bd-13f1-4d43-b53f-b1c0ceb5b0b5","handle":"qa-cd67fa554932","displayName":"QA cd67fa554932","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.862288319Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ded1c20b-ba1e-46a9-9ee9-bb9394ad004f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ded1c20b-ba1e-46a9-9ee9-bb9394ad004f
Content-Type: application/json

--- request body ---
{"handle":"qa-a7f4ed85fbc8","displayName":"QA a7f4ed85fbc8","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ded1c20b-ba1e-46a9-9ee9-bb9394ad004f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-a7f4ed85fbc8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22aa502c-1459-4c77-8d60-09fa92e11c47","handle":"qa-a7f4ed85fbc8","displayName":"QA a7f4ed85fbc8","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.896101893Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-6620dc0c-2d43-4e04-a3f0-6bdefd79a929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6620dc0c-2d43-4e04-a3f0-6bdefd79a929
Content-Type: application/json

--- request body ---
{"handle":"qa-dba42cd15c32","displayName":"QA dba42cd15c32","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6620dc0c-2d43-4e04-a3f0-6bdefd79a929
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-dba42cd15c32
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d02dcc3-9684-4acf-b3e1-e7548edcc0ea","handle":"qa-dba42cd15c32","displayName":"QA dba42cd15c32","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.927146881Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-daaaa515-7d05-4879-ba34-73270af0ab61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daaaa515-7d05-4879-ba34-73270af0ab61
Content-Type: application/json

--- request body ---
{"handle":"qa-cd67fa554932","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-daaaa515-7d05-4879-ba34-73270af0ab61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47d4d5bd-13f1-4d43-b53f-b1c0ceb5b0b5"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-91bb1f77-bef3-4d9a-9e8a-dc045bfc4cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91bb1f77-bef3-4d9a-9e8a-dc045bfc4cb3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7f4ed85fbc8","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-91bb1f77-bef3-4d9a-9e8a-dc045bfc4cb3
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
Location: /v1/conversations/cnv_4817b9a5-3070-4b0b-acaf-a31854c21004
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4817b9a5-3070-4b0b-acaf-a31854c21004","subject":"Error contract","status":"open","region":"eu","participants":["qa-cd67fa554932","qa-a7f4ed85fbc8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.980449573Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-27c922c3-b76f-41f5-97a1-4eb777250d79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27c922c3-b76f-41f5-97a1-4eb777250d79
Content-Type: application/json

--- request body ---
{"handle":"qa-dba42cd15c32","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-27c922c3-b76f-41f5-97a1-4eb777250d79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d02dcc3-9684-4acf-b3e1-e7548edcc0ea"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4817b9a5-3070-4b0b-acaf-a31854c21004/messages
correlation: qa-af25608e-b755-4f9f-952c-da6d9dc35381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af25608e-b755-4f9f-952c-da6d9dc35381
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af25608e-b755-4f9f-952c-da6d9dc35381
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4817b9a5-3070-4b0b-acaf-a31854c21004/messages","correlationId":"qa-af25608e-b755-4f9f-952c-da6d9dc35381"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81f48dc6-5fd9-4b4a-ad1b-3a10696a7a15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81f48dc6-5fd9-4b4a-ad1b-3a10696a7a15
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81f48dc6-5fd9-4b4a-ad1b-3a10696a7a15
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-46307e7e-700c-42b8-8a6e-885b7dc8d2b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46307e7e-700c-42b8-8a6e-885b7dc8d2b1
Content-Type: application/json

--- request body ---
{"handle":"qa-dba42cd15c32","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46307e7e-700c-42b8-8a6e-885b7dc8d2b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46307e7e-700c-42b8-8a6e-885b7dc8d2b1"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-cebe9dd5-eb80-4cbb-ae67-d95c7b8a5841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cebe9dd5-eb80-4cbb-ae67-d95c7b8a5841
Content-Type: application/json

--- request body ---
{"handle":"qa-a7f4ed85fbc8","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cebe9dd5-eb80-4cbb-ae67-d95c7b8a5841
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22aa502c-1459-4c77-8d60-09fa92e11c47"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e44ba9a-b13e-48ac-a77a-e9b6d1a521ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e44ba9a-b13e-48ac-a77a-e9b6d1a521ac
Content-Type: application/json

--- response: 204 in 53 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e44ba9a-b13e-48ac-a77a-e9b6d1a521ac
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-7a5e6204-c854-4cdf-bff9-ac43bbc64396

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a5e6204-c854-4cdf-bff9-ac43bbc64396
Content-Type: application/json

--- request body ---
{"handle":"qa-a7f4ed85fbc8","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a5e6204-c854-4cdf-bff9-ac43bbc64396
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a5e6204-c854-4cdf-bff9-ac43bbc64396"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-51bee8d7-e45d-49aa-a011-90de64c15388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51bee8d7-e45d-49aa-a011-90de64c15388
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-51bee8d7-e45d-49aa-a011-90de64c15388
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-aca03219-4f08-4cd6-bc61-f875b8ffd9b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aca03219-4f08-4cd6-bc61-f875b8ffd9b2
Content-Type: application/json

--- request body ---
{"handle":"qa-cd67fa554932","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aca03219-4f08-4cd6-bc61-f875b8ffd9b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aca03219-4f08-4cd6-bc61-f875b8ffd9b2"}
```
