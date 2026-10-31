# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-c9fd9f53-3baa-41e2-abb9-4a9891797457` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-493b4807-f81d-4bb3-ba27-16076660be9e` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-15f6a037-68a4-4e8f-95ca-c7a4899d7b60` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-e7c9ab1a-b3e9-4983-bea4-527f654ffcae` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 37 | `qa-9b418e16-b7d7-4e2d-9e3b-53d628f486c6` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-b5ff51a9-e26e-4835-a85f-41398498a1b6` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 34 | `qa-ee78c389-45fe-4351-b0c0-6e1dfba1d9cf` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-d645be99-fef6-4788-bed5-b3019b361645` |
| 9 | `GET /v1/credits/balance` | 200 | 13 | `qa-37b0ef8c-cbd1-48a9-91d7-59d9df269e37` |
| 10 | `POST /v1/conversations` | 402 | 15 | `qa-1893f192-aa5d-4816-8e40-8e537fe846f2` |
| 11 | `GET /v1/credits/ledger` | 200 | 48 | `qa-928a9e1c-f1a7-4b6e-af03-22dacab8a0f3` |
| 12 | `POST /v1/auth/token` | 200 | 51 | `qa-55415e3b-2030-4d87-8b18-479353f7aba5` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-8c2b02c1-3242-4517-a280-fbe542724613` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-0249112e-48e3-4e80-82e1-aded6cd4fc21` |
| 15 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-de67ca4e-8914-4454-8f30-3650459d974b` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-1e00f099-b051-4573-aa9a-4cee57f69a91` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c9fd9f53-3baa-41e2-abb9-4a9891797457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9fd9f53-3baa-41e2-abb9-4a9891797457
Content-Type: application/json

--- request body ---
{"handle":"qa-7b3897a835cb","displayName":"QA 7b3897a835cb","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9fd9f53-3baa-41e2-abb9-4a9891797457
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Location: /v1/accounts/qa-7b3897a835cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43ff9917-ab4a-4933-af26-990390504529","handle":"qa-7b3897a835cb","displayName":"QA 7b3897a835cb","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.720489114Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-493b4807-f81d-4bb3-ba27-16076660be9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-493b4807-f81d-4bb3-ba27-16076660be9e
Content-Type: application/json

--- request body ---
{"handle":"qa-6fedf753ede6","displayName":"QA 6fedf753ede6","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-493b4807-f81d-4bb3-ba27-16076660be9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Location: /v1/accounts/qa-6fedf753ede6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3adf12a8-e409-44d1-b262-feb330ac7c77","handle":"qa-6fedf753ede6","displayName":"QA 6fedf753ede6","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.776405258Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-15f6a037-68a4-4e8f-95ca-c7a4899d7b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15f6a037-68a4-4e8f-95ca-c7a4899d7b60
Content-Type: application/json

--- request body ---
{"handle":"qa-7b3897a835cb","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-15f6a037-68a4-4e8f-95ca-c7a4899d7b60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43ff9917-ab4a-4933-af26-990390504529"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e7c9ab1a-b3e9-4983-bea4-527f654ffcae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7c9ab1a-b3e9-4983-bea4-527f654ffcae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6fedf753ede6","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7c9ab1a-b3e9-4983-bea4-527f654ffcae
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
Location: /v1/conversations/cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf","subject":"Error contract","status":"open","region":"eu","participants":["qa-7b3897a835cb","qa-6fedf753ede6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.872491140Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf/messages
correlation: qa-9b418e16-b7d7-4e2d-9e3b-53d628f486c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b418e16-b7d7-4e2d-9e3b-53d628f486c6
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b418e16-b7d7-4e2d-9e3b-53d628f486c6
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

{"id":"msg_5f5e8ac6-b860-4649-908e-0fe19f1321f0","conversationId":"cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf","sender":"qa-7b3897a835cb","body":"2","createdAt":"2026-10-31T08:31:35.919775781Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf/messages
correlation: qa-b5ff51a9-e26e-4835-a85f-41398498a1b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ff51a9-e26e-4835-a85f-41398498a1b6
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5ff51a9-e26e-4835-a85f-41398498a1b6
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

{"id":"msg_f4083a12-2638-4cb8-9f78-300c41c50182","conversationId":"cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf","sender":"qa-7b3897a835cb","body":"3","createdAt":"2026-10-31T08:31:35.963279098Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf/messages
correlation: qa-ee78c389-45fe-4351-b0c0-6e1dfba1d9cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee78c389-45fe-4351-b0c0-6e1dfba1d9cf
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee78c389-45fe-4351-b0c0-6e1dfba1d9cf
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

{"id":"msg_46e1cbcf-e6a9-478c-a526-4a0bdf4bf360","conversationId":"cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf","sender":"qa-7b3897a835cb","body":"4","createdAt":"2026-10-31T08:31:36.016428856Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf/messages
correlation: qa-d645be99-fef6-4788-bed5-b3019b361645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d645be99-fef6-4788-bed5-b3019b361645
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d645be99-fef6-4788-bed5-b3019b361645
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

{"id":"msg_e217a313-cc52-4825-9989-f4014cb10194","conversationId":"cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf","sender":"qa-7b3897a835cb","body":"5","createdAt":"2026-10-31T08:31:36.040690136Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-37b0ef8c-cbd1-48a9-91d7-59d9df269e37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37b0ef8c-cbd1-48a9-91d7-59d9df269e37
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-37b0ef8c-cbd1-48a9-91d7-59d9df269e37
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

{"balance":0,"currency":"credits","accountId":"acc_43ff9917-ab4a-4933-af26-990390504529"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-1893f192-aa5d-4816-8e40-8e537fe846f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1893f192-aa5d-4816-8e40-8e537fe846f2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6fedf753ede6","subject":"One more","message":"Hi"}

--- response: 402 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1893f192-aa5d-4816-8e40-8e537fe846f2
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
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-1893f192-aa5d-4816-8e40-8e537fe846f2"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-928a9e1c-f1a7-4b6e-af03-22dacab8a0f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-928a9e1c-f1a7-4b6e-af03-22dacab8a0f3
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-928a9e1c-f1a7-4b6e-af03-22dacab8a0f3
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

{"items":[{"id":"led_fb426c23-b6b7-4867-b6ab-d5565b51cd2d","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-31T08:31:35.720498832Z"},{"id":"led_b7cde5cc-a2ea-43f7-a846-02dcc89d0375","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_193b11f4-b36d-4242-86e5-11a1ec3205bf","createdAt":"2026-10-31T08:31:35.872479368Z"},{"id":"led_41287f45-bcf3-4bdc-9572-06cd7e29906e","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_5f5e8ac6-b860-4649-908e-0fe19f1321f0","createdAt":"2026-10-31T08:31:35.919732820Z"},{"id":"led_dea7742b-ffa5-4b47-be94-f9c6ae48b00d","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_f4083a12-2638-4cb8-9f78-300c41c50182","createdAt":"2026-10-31T08:31:35.963256355Z"},{"id":"led_256bd776-e3d9-4cb9-875f-d8f74054beb3","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_46e1cbcf-e6a9-478c-a526-4a0bdf4bf360","createdAt":"2026-10-31T08:31:36.016418257Z"},{"id":"led_a8782479-baca-444e-b9ee-7e83ff36a8ca","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_e217a313-cc52-4825-9989-f4014cb10194","createdAt":"2026-10-31T08:31:36.040659759Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-55415e3b-2030-4d87-8b18-479353f7aba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55415e3b-2030-4d87-8b18-479353f7aba5
Content-Type: application/json

--- request body ---
{"handle":"qa-6fedf753ede6","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-55415e3b-2030-4d87-8b18-479353f7aba5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3adf12a8-e409-44d1-b262-feb330ac7c77"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c2b02c1-3242-4517-a280-fbe542724613

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2b02c1-3242-4517-a280-fbe542724613
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c2b02c1-3242-4517-a280-fbe542724613
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
correlation: qa-0249112e-48e3-4e80-82e1-aded6cd4fc21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0249112e-48e3-4e80-82e1-aded6cd4fc21
Content-Type: application/json

--- request body ---
{"handle":"qa-6fedf753ede6","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0249112e-48e3-4e80-82e1-aded6cd4fc21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0249112e-48e3-4e80-82e1-aded6cd4fc21"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de67ca4e-8914-4454-8f30-3650459d974b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de67ca4e-8914-4454-8f30-3650459d974b
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de67ca4e-8914-4454-8f30-3650459d974b
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
correlation: qa-1e00f099-b051-4573-aa9a-4cee57f69a91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e00f099-b051-4573-aa9a-4cee57f69a91
Content-Type: application/json

--- request body ---
{"handle":"qa-7b3897a835cb","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e00f099-b051-4573-aa9a-4cee57f69a91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e00f099-b051-4573-aa9a-4cee57f69a91"}
```
