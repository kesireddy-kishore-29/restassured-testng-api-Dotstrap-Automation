# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-7118b31e-01c0-4fda-8cb6-78596422ac45` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-64f49e34-f771-4278-bba6-1a0bbaa5d8d1` |
| 3 | `POST /v1/accounts` | 201 | 44 | `qa-cc7c3526-f147-40f7-87c6-9fe76eed4b31` |
| 4 | `POST /v1/auth/token` | 200 | 34 | `qa-77deb1f2-35bd-421b-8b50-ba740661466f` |
| 5 | `POST /v1/conversations` | 201 | 31 | `qa-15a5decf-794d-42f2-bd9a-5b14616691e6` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-a58015bd-1232-4705-ba03-b6bea6365799` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 22 | `qa-da9c5187-0889-4374-a9f0-f1695eaf8406` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-203d3f4d-d897-4783-a6ae-c743ae8bea51` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-78d7f418-f6a7-43bd-85fe-0db3da61259b` |
| 10 | `POST /v1/auth/token` | 200 | 41 | `qa-6ef88d9c-4fd9-4d8a-89d7-bf9daa644838` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-e6402b4b-9762-4413-a3ca-1f441db32c03` |
| 12 | `POST /v1/auth/token` | 401 | 19 | `qa-2e863b57-17c2-4bc8-aaf9-b44955de41d3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-be6cbbb8-92c6-4a11-a1cd-2315bd6aef0b` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-6ce7b43f-1657-49e8-be66-c634c93ec780` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7118b31e-01c0-4fda-8cb6-78596422ac45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7118b31e-01c0-4fda-8cb6-78596422ac45
Content-Type: application/json

--- request body ---
{"handle":"qa-eadee9867032","displayName":"QA eadee9867032","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7118b31e-01c0-4fda-8cb6-78596422ac45
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
Location: /v1/accounts/qa-eadee9867032
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4316c483-4caf-4723-ba59-0e6470620458","handle":"qa-eadee9867032","displayName":"QA eadee9867032","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.010480113Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-64f49e34-f771-4278-bba6-1a0bbaa5d8d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64f49e34-f771-4278-bba6-1a0bbaa5d8d1
Content-Type: application/json

--- request body ---
{"handle":"qa-8a0c4be8018a","displayName":"QA 8a0c4be8018a","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-64f49e34-f771-4278-bba6-1a0bbaa5d8d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 7
Location: /v1/accounts/qa-8a0c4be8018a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9649c7e9-2dea-4b21-9743-a28188da7723","handle":"qa-8a0c4be8018a","displayName":"QA 8a0c4be8018a","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.076472500Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-cc7c3526-f147-40f7-87c6-9fe76eed4b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc7c3526-f147-40f7-87c6-9fe76eed4b31
Content-Type: application/json

--- request body ---
{"handle":"qa-be6bb095f16c","displayName":"QA be6bb095f16c","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc7c3526-f147-40f7-87c6-9fe76eed4b31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Location: /v1/accounts/qa-be6bb095f16c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4eedca4e-3ac4-42aa-bed8-056c0c314d43","handle":"qa-be6bb095f16c","displayName":"QA be6bb095f16c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.144075488Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-77deb1f2-35bd-421b-8b50-ba740661466f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77deb1f2-35bd-421b-8b50-ba740661466f
Content-Type: application/json

--- request body ---
{"handle":"qa-eadee9867032","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-77deb1f2-35bd-421b-8b50-ba740661466f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4316c483-4caf-4723-ba59-0e6470620458"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-15a5decf-794d-42f2-bd9a-5b14616691e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a5decf-794d-42f2-bd9a-5b14616691e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8a0c4be8018a","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-15a5decf-794d-42f2-bd9a-5b14616691e6
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
Location: /v1/conversations/cnv_80e818b2-b9d8-476e-aa67-886fa43624b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_80e818b2-b9d8-476e-aa67-886fa43624b6","subject":"Error contract","status":"open","region":"eu","participants":["qa-eadee9867032","qa-8a0c4be8018a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.236831861Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a58015bd-1232-4705-ba03-b6bea6365799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a58015bd-1232-4705-ba03-b6bea6365799
Content-Type: application/json

--- request body ---
{"handle":"qa-be6bb095f16c","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a58015bd-1232-4705-ba03-b6bea6365799
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4eedca4e-3ac4-42aa-bed8-056c0c314d43"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_80e818b2-b9d8-476e-aa67-886fa43624b6/close
correlation: qa-da9c5187-0889-4374-a9f0-f1695eaf8406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da9c5187-0889-4374-a9f0-f1695eaf8406
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da9c5187-0889-4374-a9f0-f1695eaf8406
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_80e818b2-b9d8-476e-aa67-886fa43624b6/close","correlationId":"qa-da9c5187-0889-4374-a9f0-f1695eaf8406"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-203d3f4d-d897-4783-a6ae-c743ae8bea51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-203d3f4d-d897-4783-a6ae-c743ae8bea51
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-203d3f4d-d897-4783-a6ae-c743ae8bea51
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
correlation: qa-78d7f418-f6a7-43bd-85fe-0db3da61259b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78d7f418-f6a7-43bd-85fe-0db3da61259b
Content-Type: application/json

--- request body ---
{"handle":"qa-be6bb095f16c","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78d7f418-f6a7-43bd-85fe-0db3da61259b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78d7f418-f6a7-43bd-85fe-0db3da61259b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6ef88d9c-4fd9-4d8a-89d7-bf9daa644838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef88d9c-4fd9-4d8a-89d7-bf9daa644838
Content-Type: application/json

--- request body ---
{"handle":"qa-8a0c4be8018a","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ef88d9c-4fd9-4d8a-89d7-bf9daa644838
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9649c7e9-2dea-4b21-9743-a28188da7723"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6402b4b-9762-4413-a3ca-1f441db32c03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6402b4b-9762-4413-a3ca-1f441db32c03
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6402b4b-9762-4413-a3ca-1f441db32c03
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
correlation: qa-2e863b57-17c2-4bc8-aaf9-b44955de41d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e863b57-17c2-4bc8-aaf9-b44955de41d3
Content-Type: application/json

--- request body ---
{"handle":"qa-8a0c4be8018a","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e863b57-17c2-4bc8-aaf9-b44955de41d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e863b57-17c2-4bc8-aaf9-b44955de41d3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be6cbbb8-92c6-4a11-a1cd-2315bd6aef0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be6cbbb8-92c6-4a11-a1cd-2315bd6aef0b
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be6cbbb8-92c6-4a11-a1cd-2315bd6aef0b
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
correlation: qa-6ce7b43f-1657-49e8-be66-c634c93ec780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce7b43f-1657-49e8-be66-c634c93ec780
Content-Type: application/json

--- request body ---
{"handle":"qa-eadee9867032","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ce7b43f-1657-49e8-be66-c634c93ec780
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ce7b43f-1657-49e8-be66-c634c93ec780"}
```
