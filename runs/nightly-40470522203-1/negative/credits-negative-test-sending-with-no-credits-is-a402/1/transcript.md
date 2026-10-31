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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-12026059-f87c-4c58-878d-9da1c8c482c1` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-b522b33a-a303-481d-a826-7850c271041a` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-e7282943-faf5-4738-ba1e-da32f34fee4c` |
| 4 | `POST /v1/conversations` | 201 | 37 | `qa-431ec3d1-51b0-4562-88d9-fd34b57da548` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-93c571d6-471d-4c70-89c9-ce2c3c43a9a5` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-7ccc4d56-0c75-4a42-88c9-932c6dc7e25d` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-400a5644-e40d-4a8d-bdc6-f755c2f56809` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-a3123d9a-37c0-4dc3-b7f5-c50374268b37` |
| 9 | `GET /v1/credits/balance` | 200 | 11 | `qa-704371af-dba0-4b45-ab58-66e47e741cb6` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 13 | `qa-0fe13a0c-18c3-4e40-948e-7a7bef6b4a42` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-3c4b296e-113b-469d-a800-1506f09bec2d` |
| 12 | `POST /v1/auth/token` | 200 | 15 | `qa-4cbe8479-3ef5-4c6b-8150-0c60de77a51d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5e98a973-8403-44c7-9c18-d0fac94bc3f5` |
| 14 | `POST /v1/auth/token` | 401 | 16 | `qa-f14718ba-3ab6-4e9a-a7d8-be8afeac2d00` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-669b3d3d-df51-40f5-bc6e-5edc82ddd0f5` |
| 16 | `POST /v1/auth/token` | 401 | 12 | `qa-01965a73-2df8-473c-9eb2-7c8b30faf562` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12026059-f87c-4c58-878d-9da1c8c482c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12026059-f87c-4c58-878d-9da1c8c482c1
Content-Type: application/json

--- request body ---
{"handle":"qa-478b5b7ff4b8","displayName":"QA 478b5b7ff4b8","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-12026059-f87c-4c58-878d-9da1c8c482c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-478b5b7ff4b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_666b1550-c967-48cd-bc85-3ae0a4601dc4","handle":"qa-478b5b7ff4b8","displayName":"QA 478b5b7ff4b8","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.485127004Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b522b33a-a303-481d-a826-7850c271041a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b522b33a-a303-481d-a826-7850c271041a
Content-Type: application/json

--- request body ---
{"handle":"qa-a6a3222a6183","displayName":"QA a6a3222a6183","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b522b33a-a303-481d-a826-7850c271041a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-a6a3222a6183
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1bca1b7c-ca92-4676-b91f-a3b1adae540e","handle":"qa-a6a3222a6183","displayName":"QA a6a3222a6183","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.555195547Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e7282943-faf5-4738-ba1e-da32f34fee4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7282943-faf5-4738-ba1e-da32f34fee4c
Content-Type: application/json

--- request body ---
{"handle":"qa-478b5b7ff4b8","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7282943-faf5-4738-ba1e-da32f34fee4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_666b1550-c967-48cd-bc85-3ae0a4601dc4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-431ec3d1-51b0-4562-88d9-fd34b57da548

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431ec3d1-51b0-4562-88d9-fd34b57da548
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a6a3222a6183","subject":"Many messages","message":"1"}

--- response: 201 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-431ec3d1-51b0-4562-88d9-fd34b57da548
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
Location: /v1/conversations/cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6","subject":"Many messages","status":"open","region":"eu","participants":["qa-478b5b7ff4b8","qa-a6a3222a6183"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:30.667292846Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6/messages
correlation: qa-93c571d6-471d-4c70-89c9-ce2c3c43a9a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c571d6-471d-4c70-89c9-ce2c3c43a9a5
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-93c571d6-471d-4c70-89c9-ce2c3c43a9a5
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

{"id":"msg_4ff659c2-813b-4001-8506-d2d69cfc51b9","conversationId":"cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6","sender":"qa-478b5b7ff4b8","body":"2","createdAt":"2026-10-27T08:00:30.822108992Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6/messages
correlation: qa-7ccc4d56-0c75-4a42-88c9-932c6dc7e25d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ccc4d56-0c75-4a42-88c9-932c6dc7e25d
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ccc4d56-0c75-4a42-88c9-932c6dc7e25d
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

{"id":"msg_ad777581-5112-4164-a4a2-9db2fd645542","conversationId":"cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6","sender":"qa-478b5b7ff4b8","body":"3","createdAt":"2026-10-27T08:00:30.900939886Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6/messages
correlation: qa-400a5644-e40d-4a8d-bdc6-f755c2f56809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-400a5644-e40d-4a8d-bdc6-f755c2f56809
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-400a5644-e40d-4a8d-bdc6-f755c2f56809
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

{"id":"msg_cd894c65-a52e-4a74-81ef-b2ab517b2fa1","conversationId":"cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6","sender":"qa-478b5b7ff4b8","body":"4","createdAt":"2026-10-27T08:00:30.938735550Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6/messages
correlation: qa-a3123d9a-37c0-4dc3-b7f5-c50374268b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3123d9a-37c0-4dc3-b7f5-c50374268b37
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3123d9a-37c0-4dc3-b7f5-c50374268b37
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

{"id":"msg_5c4eb2f8-6a46-461e-8955-9d4c4878423a","conversationId":"cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6","sender":"qa-478b5b7ff4b8","body":"5","createdAt":"2026-10-27T08:00:30.977954418Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-704371af-dba0-4b45-ab58-66e47e741cb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-704371af-dba0-4b45-ab58-66e47e741cb6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-704371af-dba0-4b45-ab58-66e47e741cb6
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

{"balance":0,"currency":"credits","accountId":"acc_666b1550-c967-48cd-bc85-3ae0a4601dc4"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6/messages
correlation: qa-0fe13a0c-18c3-4e40-948e-7a7bef6b4a42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fe13a0c-18c3-4e40-948e-7a7bef6b4a42
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fe13a0c-18c3-4e40-948e-7a7bef6b4a42
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6/messages","correlationId":"qa-0fe13a0c-18c3-4e40-948e-7a7bef6b4a42"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3c4b296e-113b-469d-a800-1506f09bec2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c4b296e-113b-469d-a800-1506f09bec2d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c4b296e-113b-469d-a800-1506f09bec2d
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

{"items":[{"id":"led_c7a93515-96ff-4a00-8d34-af6f885c41a0","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-27T08:00:30.485153043Z"},{"id":"led_6b615093-1a5c-40fb-81b2-2d58ffb5b23b","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_cc76ffa2-d232-4d05-bdbd-25f1476fdee6","createdAt":"2026-10-27T08:00:30.666986385Z"},{"id":"led_8e671041-a3a9-44eb-9e19-3f7330073c00","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_4ff659c2-813b-4001-8506-d2d69cfc51b9","createdAt":"2026-10-27T08:00:30.822069298Z"},{"id":"led_5ffb8830-1f12-4565-af45-242e733ba17c","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_ad777581-5112-4164-a4a2-9db2fd645542","createdAt":"2026-10-27T08:00:30.900923766Z"},{"id":"led_eb18a820-70c2-466b-b134-d6590b847437","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_cd894c65-a52e-4a74-81ef-b2ab517b2fa1","createdAt":"2026-10-27T08:00:30.938688983Z"},{"id":"led_15bb5943-56c6-49b4-812f-6ae025cc1b5d","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_5c4eb2f8-6a46-461e-8955-9d4c4878423a","createdAt":"2026-10-27T08:00:30.977905948Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4cbe8479-3ef5-4c6b-8150-0c60de77a51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cbe8479-3ef5-4c6b-8150-0c60de77a51d
Content-Type: application/json

--- request body ---
{"handle":"qa-a6a3222a6183","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cbe8479-3ef5-4c6b-8150-0c60de77a51d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1bca1b7c-ca92-4676-b91f-a3b1adae540e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e98a973-8403-44c7-9c18-d0fac94bc3f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e98a973-8403-44c7-9c18-d0fac94bc3f5
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e98a973-8403-44c7-9c18-d0fac94bc3f5
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
correlation: qa-f14718ba-3ab6-4e9a-a7d8-be8afeac2d00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f14718ba-3ab6-4e9a-a7d8-be8afeac2d00
Content-Type: application/json

--- request body ---
{"handle":"qa-a6a3222a6183","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f14718ba-3ab6-4e9a-a7d8-be8afeac2d00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f14718ba-3ab6-4e9a-a7d8-be8afeac2d00"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-669b3d3d-df51-40f5-bc6e-5edc82ddd0f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-669b3d3d-df51-40f5-bc6e-5edc82ddd0f5
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-669b3d3d-df51-40f5-bc6e-5edc82ddd0f5
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
correlation: qa-01965a73-2df8-473c-9eb2-7c8b30faf562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01965a73-2df8-473c-9eb2-7c8b30faf562
Content-Type: application/json

--- request body ---
{"handle":"qa-478b5b7ff4b8","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01965a73-2df8-473c-9eb2-7c8b30faf562
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01965a73-2df8-473c-9eb2-7c8b30faf562"}
```
