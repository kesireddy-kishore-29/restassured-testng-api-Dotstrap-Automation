# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-647d7907-ad79-47f6-bfb9-600368962e2d` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-46e41565-cc61-4e7f-bd03-2ad2be98d9a7` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-ce8ffc78-ed99-42f1-9a5d-a77e461de411` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-b1be001f-e772-4e0b-aeb8-c2060ef2cce4` |
| 5 | `POST /v1/conversations` | 201 | 5 | `qa-c9b449ed-ac70-4dd1-8d34-86446c91114c` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-9cc9a9a3-09ff-4a6d-8782-3980508b93e1` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 12 | `qa-c9dcb7c0-45d9-46c4-8b1d-a4c0c48e3af8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-cd3ec9d9-1bfd-460b-90de-fef970ba9de6` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-f735323d-c3b9-4b93-a709-089fc9f08de9` |
| 10 | `POST /v1/auth/token` | 200 | 55 | `qa-c90a87fb-33ff-400a-a189-178edc6ef736` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-dad6c844-f4cc-479e-9b5b-24368135606b` |
| 12 | `POST /v1/auth/token` | 401 | 34 | `qa-8eed934e-ac95-41f4-9b2e-5e0edf25052f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-20659d3e-0df9-46ca-8632-d9d851133e89` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-61392963-6dfc-4795-af2c-909f463acebf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-647d7907-ad79-47f6-bfb9-600368962e2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-647d7907-ad79-47f6-bfb9-600368962e2d
Content-Type: application/json

--- request body ---
{"handle":"qa-3c68e60311d8","displayName":"QA 3c68e60311d8","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-647d7907-ad79-47f6-bfb9-600368962e2d
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
Location: /v1/accounts/qa-3c68e60311d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bacb6bab-e5ee-4735-b52b-c2d313d4b797","handle":"qa-3c68e60311d8","displayName":"QA 3c68e60311d8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.683338906Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-46e41565-cc61-4e7f-bd03-2ad2be98d9a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46e41565-cc61-4e7f-bd03-2ad2be98d9a7
Content-Type: application/json

--- request body ---
{"handle":"qa-54f1b383e536","displayName":"QA 54f1b383e536","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-46e41565-cc61-4e7f-bd03-2ad2be98d9a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-54f1b383e536
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ccb0611-981a-4ca2-8df1-1f8d38a4c8ca","handle":"qa-54f1b383e536","displayName":"QA 54f1b383e536","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.710345550Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ce8ffc78-ed99-42f1-9a5d-a77e461de411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8ffc78-ed99-42f1-9a5d-a77e461de411
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee18fa431b3","displayName":"QA 5ee18fa431b3","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce8ffc78-ed99-42f1-9a5d-a77e461de411
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-5ee18fa431b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0724a79a-dbfa-48d8-973c-85e96781d048","handle":"qa-5ee18fa431b3","displayName":"QA 5ee18fa431b3","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.738167645Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b1be001f-e772-4e0b-aeb8-c2060ef2cce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1be001f-e772-4e0b-aeb8-c2060ef2cce4
Content-Type: application/json

--- request body ---
{"handle":"qa-3c68e60311d8","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1be001f-e772-4e0b-aeb8-c2060ef2cce4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bacb6bab-e5ee-4735-b52b-c2d313d4b797"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c9b449ed-ac70-4dd1-8d34-86446c91114c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9b449ed-ac70-4dd1-8d34-86446c91114c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-54f1b383e536","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9b449ed-ac70-4dd1-8d34-86446c91114c
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
Location: /v1/conversations/cnv_4a098855-e8b7-4ac6-a0ae-7cda1d532d40
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4a098855-e8b7-4ac6-a0ae-7cda1d532d40","subject":"Error contract","status":"open","region":"eu","participants":["qa-3c68e60311d8","qa-54f1b383e536"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.787620419Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9cc9a9a3-09ff-4a6d-8782-3980508b93e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cc9a9a3-09ff-4a6d-8782-3980508b93e1
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee18fa431b3","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cc9a9a3-09ff-4a6d-8782-3980508b93e1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0724a79a-dbfa-48d8-973c-85e96781d048"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4a098855-e8b7-4ac6-a0ae-7cda1d532d40/read
correlation: qa-c9dcb7c0-45d9-46c4-8b1d-a4c0c48e3af8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9dcb7c0-45d9-46c4-8b1d-a4c0c48e3af8
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9dcb7c0-45d9-46c4-8b1d-a4c0c48e3af8
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4a098855-e8b7-4ac6-a0ae-7cda1d532d40/read","correlationId":"qa-c9dcb7c0-45d9-46c4-8b1d-a4c0c48e3af8"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd3ec9d9-1bfd-460b-90de-fef970ba9de6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd3ec9d9-1bfd-460b-90de-fef970ba9de6
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd3ec9d9-1bfd-460b-90de-fef970ba9de6
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
correlation: qa-f735323d-c3b9-4b93-a709-089fc9f08de9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f735323d-c3b9-4b93-a709-089fc9f08de9
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee18fa431b3","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f735323d-c3b9-4b93-a709-089fc9f08de9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f735323d-c3b9-4b93-a709-089fc9f08de9"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c90a87fb-33ff-400a-a189-178edc6ef736

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c90a87fb-33ff-400a-a189-178edc6ef736
Content-Type: application/json

--- request body ---
{"handle":"qa-54f1b383e536","password":"****"}

--- response: 200 in 55 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c90a87fb-33ff-400a-a189-178edc6ef736
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ccb0611-981a-4ca2-8df1-1f8d38a4c8ca"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dad6c844-f4cc-479e-9b5b-24368135606b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dad6c844-f4cc-479e-9b5b-24368135606b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dad6c844-f4cc-479e-9b5b-24368135606b
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
correlation: qa-8eed934e-ac95-41f4-9b2e-5e0edf25052f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eed934e-ac95-41f4-9b2e-5e0edf25052f
Content-Type: application/json

--- request body ---
{"handle":"qa-54f1b383e536","password":"****"}

--- response: 401 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8eed934e-ac95-41f4-9b2e-5e0edf25052f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8eed934e-ac95-41f4-9b2e-5e0edf25052f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20659d3e-0df9-46ca-8632-d9d851133e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20659d3e-0df9-46ca-8632-d9d851133e89
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20659d3e-0df9-46ca-8632-d9d851133e89
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
correlation: qa-61392963-6dfc-4795-af2c-909f463acebf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61392963-6dfc-4795-af2c-909f463acebf
Content-Type: application/json

--- request body ---
{"handle":"qa-3c68e60311d8","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61392963-6dfc-4795-af2c-909f463acebf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61392963-6dfc-4795-af2c-909f463acebf"}
```
