# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-fa181ffe-55b4-4ac2-8ab2-fdd28b64026f` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-d4038487-23b8-4e43-bcf5-9942ac768e08` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-08d969df-5928-495b-ade7-d35f96951d53` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-f5f5fe4c-1b60-4c4f-ba98-49891cf50bec` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-ae7a5610-09a6-4677-9570-2681fa72e474` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-272a2044-acab-42f4-b602-38c5ac009ced` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-7e7c129b-a2f3-45db-a68f-709c89d597f1` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-c7d333eb-4430-4240-ae98-aafa9accd391` |
| 9 | `GET /v1/credits/balance` | 200 | 3 | `qa-c200d856-df0d-4177-bd81-64d9943e7f44` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 5 | `qa-cf3ec9b2-f713-4e31-8a10-84ab67023e38` |
| 11 | `GET /v1/credits/ledger` | 200 | 9 | `qa-951e7a12-f7f2-4c99-9a8b-59655e6653ad` |
| 12 | `POST /v1/auth/token` | 200 | 7 | `qa-3e45c03d-4de8-4bf0-9c91-6ea2b953dde0` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-38971b32-2736-43d4-ae87-d0f900187869` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-b926bd80-8833-4009-9495-4022d1ea4695` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9b530dec-6d3d-42df-a8a6-5c97c83d94af` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-ac890756-3bab-4cba-9a8e-4b45b12abc8f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa181ffe-55b4-4ac2-8ab2-fdd28b64026f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa181ffe-55b4-4ac2-8ab2-fdd28b64026f
Content-Type: application/json

--- request body ---
{"handle":"qa-0c209d9ed381","displayName":"QA 0c209d9ed381","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa181ffe-55b4-4ac2-8ab2-fdd28b64026f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-0c209d9ed381
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fbd8882d-a15b-4812-8cef-4bdc563f362b","handle":"qa-0c209d9ed381","displayName":"QA 0c209d9ed381","region":"eu","role":"user","createdAt":"2026-11-21T09:56:59.938531542Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d4038487-23b8-4e43-bcf5-9942ac768e08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4038487-23b8-4e43-bcf5-9942ac768e08
Content-Type: application/json

--- request body ---
{"handle":"qa-7fc0fd71934c","displayName":"QA 7fc0fd71934c","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4038487-23b8-4e43-bcf5-9942ac768e08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-7fc0fd71934c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7235d0a1-04b9-4901-a2e6-4a2d665f02a7","handle":"qa-7fc0fd71934c","displayName":"QA 7fc0fd71934c","region":"eu","role":"user","createdAt":"2026-11-21T09:56:59.969593874Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08d969df-5928-495b-ade7-d35f96951d53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d969df-5928-495b-ade7-d35f96951d53
Content-Type: application/json

--- request body ---
{"handle":"qa-0c209d9ed381","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-08d969df-5928-495b-ade7-d35f96951d53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fbd8882d-a15b-4812-8cef-4bdc563f362b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f5f5fe4c-1b60-4c4f-ba98-49891cf50bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5f5fe4c-1b60-4c4f-ba98-49891cf50bec
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7fc0fd71934c","subject":"Many messages","message":"1"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5f5fe4c-1b60-4c4f-ba98-49891cf50bec
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
Location: /v1/conversations/cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658","subject":"Many messages","status":"open","region":"eu","participants":["qa-0c209d9ed381","qa-7fc0fd71934c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:00.035822689Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658/messages
correlation: qa-ae7a5610-09a6-4677-9570-2681fa72e474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae7a5610-09a6-4677-9570-2681fa72e474
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae7a5610-09a6-4677-9570-2681fa72e474
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
Content-Length: 192

{"id":"msg_6f070c6e-4ca1-4702-a02e-4555966cc54a","conversationId":"cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658","sender":"qa-0c209d9ed381","body":"2","createdAt":"2026-11-21T09:57:00.054664966Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658/messages
correlation: qa-272a2044-acab-42f4-b602-38c5ac009ced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-272a2044-acab-42f4-b602-38c5ac009ced
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-272a2044-acab-42f4-b602-38c5ac009ced
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
Content-Length: 192

{"id":"msg_a70508e4-c999-435c-af71-8b1ee1a09205","conversationId":"cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658","sender":"qa-0c209d9ed381","body":"3","createdAt":"2026-11-21T09:57:00.079846251Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658/messages
correlation: qa-7e7c129b-a2f3-45db-a68f-709c89d597f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e7c129b-a2f3-45db-a68f-709c89d597f1
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e7c129b-a2f3-45db-a68f-709c89d597f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_185bb4a2-a185-40cc-8f25-5245d969a744","conversationId":"cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658","sender":"qa-0c209d9ed381","body":"4","createdAt":"2026-11-21T09:57:00.099654685Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658/messages
correlation: qa-c7d333eb-4430-4240-ae98-aafa9accd391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7d333eb-4430-4240-ae98-aafa9accd391
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7d333eb-4430-4240-ae98-aafa9accd391
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_f4f234f1-ade9-4c69-90f1-3ec26cc1f39b","conversationId":"cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658","sender":"qa-0c209d9ed381","body":"5","createdAt":"2026-11-21T09:57:00.114055581Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-c200d856-df0d-4177-bd81-64d9943e7f44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c200d856-df0d-4177-bd81-64d9943e7f44
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c200d856-df0d-4177-bd81-64d9943e7f44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_fbd8882d-a15b-4812-8cef-4bdc563f362b"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658/messages
correlation: qa-cf3ec9b2-f713-4e31-8a10-84ab67023e38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf3ec9b2-f713-4e31-8a10-84ab67023e38
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf3ec9b2-f713-4e31-8a10-84ab67023e38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658/messages","correlationId":"qa-cf3ec9b2-f713-4e31-8a10-84ab67023e38"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-951e7a12-f7f2-4c99-9a8b-59655e6653ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951e7a12-f7f2-4c99-9a8b-59655e6653ad
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-951e7a12-f7f2-4c99-9a8b-59655e6653ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_5ce440d5-172d-4ac1-aa16-fca873870156","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-21T09:56:59.938544811Z"},{"id":"led_a423ee75-fb8b-4224-8d34-fbc06c5bdbc6","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_78ae71ca-fe4c-4742-8fa9-0e963bb3d658","createdAt":"2026-11-21T09:57:00.035799475Z"},{"id":"led_b2a9d41b-d924-4dbf-98f8-3a4d69a1f072","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_6f070c6e-4ca1-4702-a02e-4555966cc54a","createdAt":"2026-11-21T09:57:00.054641321Z"},{"id":"led_fa34fb53-3a19-4927-a96a-8a727a124068","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_a70508e4-c999-435c-af71-8b1ee1a09205","createdAt":"2026-11-21T09:57:00.079823968Z"},{"id":"led_8c6d04d6-1ae3-47ae-bc3b-ceba735d15bc","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_185bb4a2-a185-40cc-8f25-5245d969a744","createdAt":"2026-11-21T09:57:00.099620665Z"},{"id":"led_50df7a65-710e-4988-97d4-d2a60d68d86b","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_f4f234f1-ade9-4c69-90f1-3ec26cc1f39b","createdAt":"2026-11-21T09:57:00.114030433Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-3e45c03d-4de8-4bf0-9c91-6ea2b953dde0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e45c03d-4de8-4bf0-9c91-6ea2b953dde0
Content-Type: application/json

--- request body ---
{"handle":"qa-7fc0fd71934c","password":"****"}

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e45c03d-4de8-4bf0-9c91-6ea2b953dde0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7235d0a1-04b9-4901-a2e6-4a2d665f02a7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38971b32-2736-43d4-ae87-d0f900187869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38971b32-2736-43d4-ae87-d0f900187869
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38971b32-2736-43d4-ae87-d0f900187869
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-b926bd80-8833-4009-9495-4022d1ea4695

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b926bd80-8833-4009-9495-4022d1ea4695
Content-Type: application/json

--- request body ---
{"handle":"qa-7fc0fd71934c","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b926bd80-8833-4009-9495-4022d1ea4695
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b926bd80-8833-4009-9495-4022d1ea4695"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b530dec-6d3d-42df-a8a6-5c97c83d94af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b530dec-6d3d-42df-a8a6-5c97c83d94af
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b530dec-6d3d-42df-a8a6-5c97c83d94af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-ac890756-3bab-4cba-9a8e-4b45b12abc8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac890756-3bab-4cba-9a8e-4b45b12abc8f
Content-Type: application/json

--- request body ---
{"handle":"qa-0c209d9ed381","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac890756-3bab-4cba-9a8e-4b45b12abc8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac890756-3bab-4cba-9a8e-4b45b12abc8f"}
```
