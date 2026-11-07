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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-e2da2d33-b3b1-4ff6-8f47-b60aabd684e6` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-5e4e0c5c-5385-4d59-9bb1-0838ea3bbea9` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-5059f90f-45de-4c00-bf1d-576a15889185` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-4725f379-c6b9-4af3-bb6a-b39601e82df1` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 33 | `qa-566c7d1b-4d13-4f71-9e70-0704f2663f1b` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 25 | `qa-ffee7d73-029b-4f42-b8a5-e2404f5401f5` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-53842676-f1fe-4458-ad92-e7a3dc38e63f` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-31d43038-24a1-47d8-8c04-414963889633` |
| 9 | `GET /v1/credits/balance` | 200 | 38 | `qa-1455a98f-c7cd-412d-85bf-1c6d30f7d988` |
| 10 | `POST /v1/conversations` | 402 | 8 | `qa-0aa18914-cc88-4dee-949b-3bd2247b3c72` |
| 11 | `GET /v1/credits/ledger` | 200 | 35 | `qa-6fedbbc4-53d7-42ee-a693-62d008a27ed6` |
| 12 | `POST /v1/auth/token` | 200 | 25 | `qa-05e0967b-11b0-40f4-b48c-15b16a52cd39` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3145407c-dc19-4e74-83bc-a0dc645b0600` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-bbc3453e-c642-4708-877f-f4e41022b52c` |
| 15 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-042cb092-c72d-459b-a338-4a404f82e7d4` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-c5a886cf-51d8-4916-b59c-0db03f043ec1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2da2d33-b3b1-4ff6-8f47-b60aabd684e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2da2d33-b3b1-4ff6-8f47-b60aabd684e6
Content-Type: application/json

--- request body ---
{"handle":"qa-6be8fe6860b7","displayName":"QA 6be8fe6860b7","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2da2d33-b3b1-4ff6-8f47-b60aabd684e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-6be8fe6860b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75115a1a-1f8c-46d5-99c0-b5c637d295b0","handle":"qa-6be8fe6860b7","displayName":"QA 6be8fe6860b7","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.772709589Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5e4e0c5c-5385-4d59-9bb1-0838ea3bbea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4e0c5c-5385-4d59-9bb1-0838ea3bbea9
Content-Type: application/json

--- request body ---
{"handle":"qa-e4416b2a03a6","displayName":"QA e4416b2a03a6","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e4e0c5c-5385-4d59-9bb1-0838ea3bbea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-e4416b2a03a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ceb39ec3-e706-475b-a151-40abb87a94b7","handle":"qa-e4416b2a03a6","displayName":"QA e4416b2a03a6","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.841014223Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5059f90f-45de-4c00-bf1d-576a15889185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5059f90f-45de-4c00-bf1d-576a15889185
Content-Type: application/json

--- request body ---
{"handle":"qa-6be8fe6860b7","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5059f90f-45de-4c00-bf1d-576a15889185
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75115a1a-1f8c-46d5-99c0-b5c637d295b0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4725f379-c6b9-4af3-bb6a-b39601e82df1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4725f379-c6b9-4af3-bb6a-b39601e82df1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4416b2a03a6","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4725f379-c6b9-4af3-bb6a-b39601e82df1
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
Location: /v1/conversations/cnv_9287d319-d0fa-4c28-8db9-54d605fed64e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9287d319-d0fa-4c28-8db9-54d605fed64e","subject":"Error contract","status":"open","region":"eu","participants":["qa-6be8fe6860b7","qa-e4416b2a03a6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.924191261Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9287d319-d0fa-4c28-8db9-54d605fed64e/messages
correlation: qa-566c7d1b-4d13-4f71-9e70-0704f2663f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-566c7d1b-4d13-4f71-9e70-0704f2663f1b
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-566c7d1b-4d13-4f71-9e70-0704f2663f1b
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

{"id":"msg_eee943dd-429a-4418-8ed7-f33c1f0282b3","conversationId":"cnv_9287d319-d0fa-4c28-8db9-54d605fed64e","sender":"qa-6be8fe6860b7","body":"2","createdAt":"2026-10-30T08:46:04.964536244Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_9287d319-d0fa-4c28-8db9-54d605fed64e/messages
correlation: qa-ffee7d73-029b-4f42-b8a5-e2404f5401f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffee7d73-029b-4f42-b8a5-e2404f5401f5
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffee7d73-029b-4f42-b8a5-e2404f5401f5
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

{"id":"msg_9fcd0be9-4fbe-451a-8e89-d8fc1e1f56ae","conversationId":"cnv_9287d319-d0fa-4c28-8db9-54d605fed64e","sender":"qa-6be8fe6860b7","body":"3","createdAt":"2026-10-30T08:46:05.021109074Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_9287d319-d0fa-4c28-8db9-54d605fed64e/messages
correlation: qa-53842676-f1fe-4458-ad92-e7a3dc38e63f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53842676-f1fe-4458-ad92-e7a3dc38e63f
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-53842676-f1fe-4458-ad92-e7a3dc38e63f
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

{"id":"msg_c1d2eba6-38d3-42cb-aaeb-15d7a32f1f80","conversationId":"cnv_9287d319-d0fa-4c28-8db9-54d605fed64e","sender":"qa-6be8fe6860b7","body":"4","createdAt":"2026-10-30T08:46:05.067282031Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_9287d319-d0fa-4c28-8db9-54d605fed64e/messages
correlation: qa-31d43038-24a1-47d8-8c04-414963889633

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31d43038-24a1-47d8-8c04-414963889633
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-31d43038-24a1-47d8-8c04-414963889633
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

{"id":"msg_245c07ac-5545-4225-9bfc-1bdd08f8a090","conversationId":"cnv_9287d319-d0fa-4c28-8db9-54d605fed64e","sender":"qa-6be8fe6860b7","body":"5","createdAt":"2026-10-30T08:46:05.103788899Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-1455a98f-c7cd-412d-85bf-1c6d30f7d988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1455a98f-c7cd-412d-85bf-1c6d30f7d988
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1455a98f-c7cd-412d-85bf-1c6d30f7d988
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

{"balance":0,"currency":"credits","accountId":"acc_75115a1a-1f8c-46d5-99c0-b5c637d295b0"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-0aa18914-cc88-4dee-949b-3bd2247b3c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa18914-cc88-4dee-949b-3bd2247b3c72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4416b2a03a6","subject":"One more","message":"Hi"}

--- response: 402 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aa18914-cc88-4dee-949b-3bd2247b3c72
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-0aa18914-cc88-4dee-949b-3bd2247b3c72"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6fedbbc4-53d7-42ee-a693-62d008a27ed6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fedbbc4-53d7-42ee-a693-62d008a27ed6
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fedbbc4-53d7-42ee-a693-62d008a27ed6
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

{"items":[{"id":"led_1339bcfa-2e06-4101-b8fb-960b7525be95","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-30T08:46:04.772723413Z"},{"id":"led_86b2361c-a1f4-4738-a915-222babbf96d3","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_9287d319-d0fa-4c28-8db9-54d605fed64e","createdAt":"2026-10-30T08:46:04.924175524Z"},{"id":"led_4b5539ee-0cd6-4dcc-a39b-ee504fa0b617","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_eee943dd-429a-4418-8ed7-f33c1f0282b3","createdAt":"2026-10-30T08:46:04.964520989Z"},{"id":"led_8fcfe4a0-4236-437a-94b1-93be568fe4d6","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_9fcd0be9-4fbe-451a-8e89-d8fc1e1f56ae","createdAt":"2026-10-30T08:46:05.021100878Z"},{"id":"led_de88c754-81f5-4334-9a1d-a6c83ef355ab","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_c1d2eba6-38d3-42cb-aaeb-15d7a32f1f80","createdAt":"2026-10-30T08:46:05.067272812Z"},{"id":"led_68995402-7e7c-48e5-8807-91ae83c9171d","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_245c07ac-5545-4225-9bfc-1bdd08f8a090","createdAt":"2026-10-30T08:46:05.103777806Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-05e0967b-11b0-40f4-b48c-15b16a52cd39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05e0967b-11b0-40f4-b48c-15b16a52cd39
Content-Type: application/json

--- request body ---
{"handle":"qa-e4416b2a03a6","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-05e0967b-11b0-40f4-b48c-15b16a52cd39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ceb39ec3-e706-475b-a151-40abb87a94b7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3145407c-dc19-4e74-83bc-a0dc645b0600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3145407c-dc19-4e74-83bc-a0dc645b0600
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3145407c-dc19-4e74-83bc-a0dc645b0600
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
correlation: qa-bbc3453e-c642-4708-877f-f4e41022b52c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbc3453e-c642-4708-877f-f4e41022b52c
Content-Type: application/json

--- request body ---
{"handle":"qa-e4416b2a03a6","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbc3453e-c642-4708-877f-f4e41022b52c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bbc3453e-c642-4708-877f-f4e41022b52c"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-042cb092-c72d-459b-a338-4a404f82e7d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-042cb092-c72d-459b-a338-4a404f82e7d4
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-042cb092-c72d-459b-a338-4a404f82e7d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 9
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-c5a886cf-51d8-4916-b59c-0db03f043ec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5a886cf-51d8-4916-b59c-0db03f043ec1
Content-Type: application/json

--- request body ---
{"handle":"qa-6be8fe6860b7","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5a886cf-51d8-4916-b59c-0db03f043ec1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5a886cf-51d8-4916-b59c-0db03f043ec1"}
```
