# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 414 | `qa-c4e8d35e-4002-4f23-a855-7bb2472bf3a7` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-b876dbc2-6465-4536-bcf3-5a4ee3f61844` |
| 3 | `POST /v1/accounts` | 201 | 45 | `qa-9f45b7d6-6454-4c99-b0e8-d23de2997e96` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-90b471ae-0c16-4fb3-83bf-a165faffe2e9` |
| 5 | `POST /v1/conversations` | 201 | 64 | `qa-609ef560-1b26-455d-9249-0414100ca6b1` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-0d4e3290-bad0-4900-9968-fa58811bfc06` |
| 7 | `GET /v1/conversations/{id}` | 403 | 22 | `qa-1f074534-9c7d-4b7b-b265-2b418aca3655` |
| 8 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-c03a2772-1526-4100-bf8a-7e3acf929106` |
| 9 | `POST /v1/auth/token` | 401 | 28 | `qa-6d591c9f-77c0-4811-ae33-66e09da2e47d` |
| 10 | `POST /v1/auth/token` | 200 | 68 | `qa-25a5d526-75ec-410b-8df6-44c1ae18b78e` |
| 11 | `DELETE /v1/accounts/me` | 204 | 64 | `qa-70d04e73-3380-4ece-930d-90cf8680d485` |
| 12 | `POST /v1/auth/token` | 401 | 62 | `qa-d85ee869-99f8-4da0-96c2-d3ffc58710c4` |
| 13 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-66ec8784-ee41-4400-bb53-feef3a06fe83` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-bc2d8d92-97bd-463a-9a8d-f75ddd74d26f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4e8d35e-4002-4f23-a855-7bb2472bf3a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e8d35e-4002-4f23-a855-7bb2472bf3a7
Content-Type: application/json

--- request body ---
{"handle":"qa-8d907a74c7e4","displayName":"QA 8d907a74c7e4","password":"****","region":"eu"}

--- response: 201 in 414 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4e8d35e-4002-4f23-a855-7bb2472bf3a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-8d907a74c7e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9696734-759a-432e-a912-b525853a6c07","handle":"qa-8d907a74c7e4","displayName":"QA 8d907a74c7e4","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.336719108Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b876dbc2-6465-4536-bcf3-5a4ee3f61844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b876dbc2-6465-4536-bcf3-5a4ee3f61844
Content-Type: application/json

--- request body ---
{"handle":"qa-8be35938cca6","displayName":"QA 8be35938cca6","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b876dbc2-6465-4536-bcf3-5a4ee3f61844
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-8be35938cca6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aad9464f-5edd-4840-aa93-bcf22c02d302","handle":"qa-8be35938cca6","displayName":"QA 8be35938cca6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.829838996Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-9f45b7d6-6454-4c99-b0e8-d23de2997e96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f45b7d6-6454-4c99-b0e8-d23de2997e96
Content-Type: application/json

--- request body ---
{"handle":"qa-d356af160270","displayName":"QA d356af160270","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f45b7d6-6454-4c99-b0e8-d23de2997e96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-d356af160270
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6a64d33-3ebd-46cf-ab15-9aa4e8d08ffb","handle":"qa-d356af160270","displayName":"QA d356af160270","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.898976359Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-90b471ae-0c16-4fb3-83bf-a165faffe2e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90b471ae-0c16-4fb3-83bf-a165faffe2e9
Content-Type: application/json

--- request body ---
{"handle":"qa-8d907a74c7e4","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-90b471ae-0c16-4fb3-83bf-a165faffe2e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9696734-759a-432e-a912-b525853a6c07"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-609ef560-1b26-455d-9249-0414100ca6b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-609ef560-1b26-455d-9249-0414100ca6b1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8be35938cca6","subject":"Error contract","message":"Hi"}

--- response: 201 in 64 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-609ef560-1b26-455d-9249-0414100ca6b1
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
Location: /v1/conversations/cnv_08ce5994-cd9f-4933-a80a-671c06db451c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_08ce5994-cd9f-4933-a80a-671c06db451c","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d907a74c7e4","qa-8be35938cca6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.990376891Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0d4e3290-bad0-4900-9968-fa58811bfc06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d4e3290-bad0-4900-9968-fa58811bfc06
Content-Type: application/json

--- request body ---
{"handle":"qa-d356af160270","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d4e3290-bad0-4900-9968-fa58811bfc06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6a64d33-3ebd-46cf-ab15-9aa4e8d08ffb"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_08ce5994-cd9f-4933-a80a-671c06db451c
correlation: qa-1f074534-9c7d-4b7b-b265-2b418aca3655

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f074534-9c7d-4b7b-b265-2b418aca3655
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f074534-9c7d-4b7b-b265-2b418aca3655
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_08ce5994-cd9f-4933-a80a-671c06db451c","correlationId":"qa-1f074534-9c7d-4b7b-b265-2b418aca3655"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c03a2772-1526-4100-bf8a-7e3acf929106

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c03a2772-1526-4100-bf8a-7e3acf929106
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c03a2772-1526-4100-bf8a-7e3acf929106
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
correlation: qa-6d591c9f-77c0-4811-ae33-66e09da2e47d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d591c9f-77c0-4811-ae33-66e09da2e47d
Content-Type: application/json

--- request body ---
{"handle":"qa-d356af160270","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d591c9f-77c0-4811-ae33-66e09da2e47d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d591c9f-77c0-4811-ae33-66e09da2e47d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-25a5d526-75ec-410b-8df6-44c1ae18b78e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25a5d526-75ec-410b-8df6-44c1ae18b78e
Content-Type: application/json

--- request body ---
{"handle":"qa-8be35938cca6","password":"****"}

--- response: 200 in 68 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-25a5d526-75ec-410b-8df6-44c1ae18b78e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aad9464f-5edd-4840-aa93-bcf22c02d302"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70d04e73-3380-4ece-930d-90cf8680d485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d04e73-3380-4ece-930d-90cf8680d485
Content-Type: application/json

--- response: 204 in 64 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70d04e73-3380-4ece-930d-90cf8680d485
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
correlation: qa-d85ee869-99f8-4da0-96c2-d3ffc58710c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d85ee869-99f8-4da0-96c2-d3ffc58710c4
Content-Type: application/json

--- request body ---
{"handle":"qa-8be35938cca6","password":"****"}

--- response: 401 in 62 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d85ee869-99f8-4da0-96c2-d3ffc58710c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d85ee869-99f8-4da0-96c2-d3ffc58710c4"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66ec8784-ee41-4400-bb53-feef3a06fe83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ec8784-ee41-4400-bb53-feef3a06fe83
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66ec8784-ee41-4400-bb53-feef3a06fe83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-bc2d8d92-97bd-463a-9a8d-f75ddd74d26f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc2d8d92-97bd-463a-9a8d-f75ddd74d26f
Content-Type: application/json

--- request body ---
{"handle":"qa-8d907a74c7e4","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc2d8d92-97bd-463a-9a8d-f75ddd74d26f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc2d8d92-97bd-463a-9a8d-f75ddd74d26f"}
```
