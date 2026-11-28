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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-0e2f3b7a-3a35-4fb6-b194-7a77e6bea309` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-20bda89c-a68b-43d5-af0c-b01a7cdd0eca` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-c13e00ef-fd59-486b-962d-7fb17f79a03b` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-f08bbc7c-12ac-4129-86c3-57617732af84` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-c4421090-fea1-4d32-add8-45cf05b0f7b0` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-4bca081b-1e3f-427a-b124-8fc7f63fbe7e` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-b03c30dd-1c42-4e2d-befc-6bf626490486` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-73cbc9c7-b1f0-4587-9cac-415bfdcff6ec` |
| 9 | `GET /v1/credits/balance` | 200 | 32 | `qa-a937ca22-84e7-4d04-affc-afe58831a91a` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 9 | `qa-58cc3b0f-5373-4df4-a1b0-7c1fc7f6104c` |
| 11 | `GET /v1/credits/ledger` | 200 | 14 | `qa-b0d41436-43ad-4fdc-8426-553c34ec796e` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-24cd393d-8e99-42c9-adb7-7dca92757064` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-11919951-fa1c-40ea-9614-794eb4b1b842` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-608c558f-c8ab-4eea-ae3d-0e71a91ccc97` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2e767356-62ab-42d7-a0a1-48580a654b80` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-dc6b192b-4c11-4cb4-992e-71f7f40b831a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e2f3b7a-3a35-4fb6-b194-7a77e6bea309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e2f3b7a-3a35-4fb6-b194-7a77e6bea309
Content-Type: application/json

--- request body ---
{"handle":"qa-2c9f2a3083cc","displayName":"QA 2c9f2a3083cc","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e2f3b7a-3a35-4fb6-b194-7a77e6bea309
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
Location: /v1/accounts/qa-2c9f2a3083cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a2ddaa0-4439-4a8e-9269-1cf703e2509f","handle":"qa-2c9f2a3083cc","displayName":"QA 2c9f2a3083cc","region":"eu","role":"user","createdAt":"2026-11-22T09:54:51.359214801Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-20bda89c-a68b-43d5-af0c-b01a7cdd0eca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20bda89c-a68b-43d5-af0c-b01a7cdd0eca
Content-Type: application/json

--- request body ---
{"handle":"qa-4d74a0638b52","displayName":"QA 4d74a0638b52","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-20bda89c-a68b-43d5-af0c-b01a7cdd0eca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-4d74a0638b52
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c2a196c4-17f4-4e73-b536-045e33f29264","handle":"qa-4d74a0638b52","displayName":"QA 4d74a0638b52","region":"eu","role":"user","createdAt":"2026-11-22T09:54:51.429179531Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c13e00ef-fd59-486b-962d-7fb17f79a03b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c13e00ef-fd59-486b-962d-7fb17f79a03b
Content-Type: application/json

--- request body ---
{"handle":"qa-2c9f2a3083cc","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c13e00ef-fd59-486b-962d-7fb17f79a03b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a2ddaa0-4439-4a8e-9269-1cf703e2509f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f08bbc7c-12ac-4129-86c3-57617732af84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f08bbc7c-12ac-4129-86c3-57617732af84
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4d74a0638b52","subject":"Many messages","message":"1"}

--- response: 201 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f08bbc7c-12ac-4129-86c3-57617732af84
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
Location: /v1/conversations/cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee","subject":"Many messages","status":"open","region":"eu","participants":["qa-2c9f2a3083cc","qa-4d74a0638b52"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:51.501477740Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee/messages
correlation: qa-c4421090-fea1-4d32-add8-45cf05b0f7b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4421090-fea1-4d32-add8-45cf05b0f7b0
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4421090-fea1-4d32-add8-45cf05b0f7b0
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

{"id":"msg_1dcedbce-edb6-47a6-9e0e-1e8afaf2bb53","conversationId":"cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee","sender":"qa-2c9f2a3083cc","body":"2","createdAt":"2026-11-22T09:54:51.546993972Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee/messages
correlation: qa-4bca081b-1e3f-427a-b124-8fc7f63fbe7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bca081b-1e3f-427a-b124-8fc7f63fbe7e
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bca081b-1e3f-427a-b124-8fc7f63fbe7e
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

{"id":"msg_6f06a120-91d3-41ec-a41b-cca5310bfb19","conversationId":"cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee","sender":"qa-2c9f2a3083cc","body":"3","createdAt":"2026-11-22T09:54:51.573983013Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee/messages
correlation: qa-b03c30dd-1c42-4e2d-befc-6bf626490486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b03c30dd-1c42-4e2d-befc-6bf626490486
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b03c30dd-1c42-4e2d-befc-6bf626490486
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

{"id":"msg_1473a7ac-36ff-4aee-8903-01fc36d28601","conversationId":"cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee","sender":"qa-2c9f2a3083cc","body":"4","createdAt":"2026-11-22T09:54:51.601255715Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee/messages
correlation: qa-73cbc9c7-b1f0-4587-9cac-415bfdcff6ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73cbc9c7-b1f0-4587-9cac-415bfdcff6ec
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-73cbc9c7-b1f0-4587-9cac-415bfdcff6ec
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

{"id":"msg_45202115-d824-4575-9afd-dc5693323ea1","conversationId":"cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee","sender":"qa-2c9f2a3083cc","body":"5","createdAt":"2026-11-22T09:54:51.624293703Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a937ca22-84e7-4d04-affc-afe58831a91a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a937ca22-84e7-4d04-affc-afe58831a91a
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a937ca22-84e7-4d04-affc-afe58831a91a
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

{"balance":0,"currency":"credits","accountId":"acc_4a2ddaa0-4439-4a8e-9269-1cf703e2509f"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee/messages
correlation: qa-58cc3b0f-5373-4df4-a1b0-7c1fc7f6104c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58cc3b0f-5373-4df4-a1b0-7c1fc7f6104c
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58cc3b0f-5373-4df4-a1b0-7c1fc7f6104c
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee/messages","correlationId":"qa-58cc3b0f-5373-4df4-a1b0-7c1fc7f6104c"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b0d41436-43ad-4fdc-8426-553c34ec796e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0d41436-43ad-4fdc-8426-553c34ec796e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0d41436-43ad-4fdc-8426-553c34ec796e
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

{"items":[{"id":"led_354267bd-90f6-4eb7-a1b3-84b470cb67b4","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-22T09:54:51.359230050Z"},{"id":"led_b0e6f4f2-e8e3-463c-8050-140977ff170d","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_de9cfb35-c2af-4b7a-a5bd-69d7b15b2cee","createdAt":"2026-11-22T09:54:51.501411546Z"},{"id":"led_83e9d2d9-39c1-46bb-b0c3-9fb42dff381e","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_1dcedbce-edb6-47a6-9e0e-1e8afaf2bb53","createdAt":"2026-11-22T09:54:51.546944169Z"},{"id":"led_0ba690c5-ea1e-4281-a8ac-12b79e13b6ac","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_6f06a120-91d3-41ec-a41b-cca5310bfb19","createdAt":"2026-11-22T09:54:51.573941636Z"},{"id":"led_3c33fb48-df23-4037-9784-1ae37880abd8","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_1473a7ac-36ff-4aee-8903-01fc36d28601","createdAt":"2026-11-22T09:54:51.601205461Z"},{"id":"led_428b9c8d-e225-4842-8b8a-f620f42571da","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_45202115-d824-4575-9afd-dc5693323ea1","createdAt":"2026-11-22T09:54:51.624256644Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-24cd393d-8e99-42c9-adb7-7dca92757064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24cd393d-8e99-42c9-adb7-7dca92757064
Content-Type: application/json

--- request body ---
{"handle":"qa-4d74a0638b52","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-24cd393d-8e99-42c9-adb7-7dca92757064
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c2a196c4-17f4-4e73-b536-045e33f29264"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11919951-fa1c-40ea-9614-794eb4b1b842

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11919951-fa1c-40ea-9614-794eb4b1b842
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11919951-fa1c-40ea-9614-794eb4b1b842
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
correlation: qa-608c558f-c8ab-4eea-ae3d-0e71a91ccc97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608c558f-c8ab-4eea-ae3d-0e71a91ccc97
Content-Type: application/json

--- request body ---
{"handle":"qa-4d74a0638b52","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-608c558f-c8ab-4eea-ae3d-0e71a91ccc97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-608c558f-c8ab-4eea-ae3d-0e71a91ccc97"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e767356-62ab-42d7-a0a1-48580a654b80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e767356-62ab-42d7-a0a1-48580a654b80
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e767356-62ab-42d7-a0a1-48580a654b80
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
correlation: qa-dc6b192b-4c11-4cb4-992e-71f7f40b831a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc6b192b-4c11-4cb4-992e-71f7f40b831a
Content-Type: application/json

--- request body ---
{"handle":"qa-2c9f2a3083cc","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc6b192b-4c11-4cb4-992e-71f7f40b831a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc6b192b-4c11-4cb4-992e-71f7f40b831a"}
```
