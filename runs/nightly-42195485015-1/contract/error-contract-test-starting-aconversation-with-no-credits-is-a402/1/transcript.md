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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-bea25ea4-3e71-4910-bd73-9a876a338bfa` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-ab7d96d6-a344-4b36-81e2-51f6ec955737` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-52d6851f-dc7b-4454-998d-75bbb5baf52e` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-2fac94e2-36b1-4f4e-a9cb-de910591fcc5` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-7fe9d6ba-96b3-4027-98f2-c09046372c9d` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-2f4cb36d-7b19-4c3d-8a36-f58aec7d6f66` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-99a2997e-c2d3-4010-89ae-b1d1df678fc3` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-994196ea-97ed-4b08-99fb-bd318f3364a8` |
| 9 | `GET /v1/credits/balance` | 200 | 22 | `qa-06a56ace-3833-47ed-ae7b-708cb2e7773e` |
| 10 | `POST /v1/conversations` | 402 | 13 | `qa-65a0f563-e6fd-4b4f-974b-6b5039001d09` |
| 11 | `GET /v1/credits/ledger` | 200 | 15 | `qa-5399a0c1-1b11-41c6-a585-3d3fea4b7933` |
| 12 | `POST /v1/auth/token` | 200 | 32 | `qa-28849167-498c-4838-8273-c6324fa2b9dc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-ff4c42e5-ba56-442f-b366-7a571dc6e8ad` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-bed11a4e-1f25-4400-ab47-513d4aaec641` |
| 15 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a888f0b6-999d-43b3-b67b-106eb3c904f2` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-4a5ecb90-395a-488b-89c7-442168faf788` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bea25ea4-3e71-4910-bd73-9a876a338bfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea25ea4-3e71-4910-bd73-9a876a338bfa
Content-Type: application/json

--- request body ---
{"handle":"qa-ecb4fcd1b7c6","displayName":"QA ecb4fcd1b7c6","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bea25ea4-3e71-4910-bd73-9a876a338bfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Location: /v1/accounts/qa-ecb4fcd1b7c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0926f372-2aa0-4c36-a895-7f704b2c885f","handle":"qa-ecb4fcd1b7c6","displayName":"QA ecb4fcd1b7c6","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.824418744Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ab7d96d6-a344-4b36-81e2-51f6ec955737

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab7d96d6-a344-4b36-81e2-51f6ec955737
Content-Type: application/json

--- request body ---
{"handle":"qa-f92e0b83920e","displayName":"QA f92e0b83920e","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab7d96d6-a344-4b36-81e2-51f6ec955737
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Location: /v1/accounts/qa-f92e0b83920e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bad87817-f9a4-4d75-b8ea-bd3eeb677c2d","handle":"qa-f92e0b83920e","displayName":"QA f92e0b83920e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.883342383Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-52d6851f-dc7b-4454-998d-75bbb5baf52e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52d6851f-dc7b-4454-998d-75bbb5baf52e
Content-Type: application/json

--- request body ---
{"handle":"qa-ecb4fcd1b7c6","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-52d6851f-dc7b-4454-998d-75bbb5baf52e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0926f372-2aa0-4c36-a895-7f704b2c885f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2fac94e2-36b1-4f4e-a9cb-de910591fcc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fac94e2-36b1-4f4e-a9cb-de910591fcc5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f92e0b83920e","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fac94e2-36b1-4f4e-a9cb-de910591fcc5
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
Location: /v1/conversations/cnv_0de93a9e-16a6-492f-9aeb-4f229da039df
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0de93a9e-16a6-492f-9aeb-4f229da039df","subject":"Error contract","status":"open","region":"eu","participants":["qa-ecb4fcd1b7c6","qa-f92e0b83920e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.019863821Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0de93a9e-16a6-492f-9aeb-4f229da039df/messages
correlation: qa-7fe9d6ba-96b3-4027-98f2-c09046372c9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fe9d6ba-96b3-4027-98f2-c09046372c9d
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fe9d6ba-96b3-4027-98f2-c09046372c9d
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

{"id":"msg_d093bd0e-0bf4-4872-81cc-867d763e5ec0","conversationId":"cnv_0de93a9e-16a6-492f-9aeb-4f229da039df","sender":"qa-ecb4fcd1b7c6","body":"2","createdAt":"2026-11-06T09:30:34.052409763Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_0de93a9e-16a6-492f-9aeb-4f229da039df/messages
correlation: qa-2f4cb36d-7b19-4c3d-8a36-f58aec7d6f66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f4cb36d-7b19-4c3d-8a36-f58aec7d6f66
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f4cb36d-7b19-4c3d-8a36-f58aec7d6f66
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

{"id":"msg_8e7d3659-bdcb-4c1b-ba45-6654fcf98486","conversationId":"cnv_0de93a9e-16a6-492f-9aeb-4f229da039df","sender":"qa-ecb4fcd1b7c6","body":"3","createdAt":"2026-11-06T09:30:34.084706836Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0de93a9e-16a6-492f-9aeb-4f229da039df/messages
correlation: qa-99a2997e-c2d3-4010-89ae-b1d1df678fc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99a2997e-c2d3-4010-89ae-b1d1df678fc3
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-99a2997e-c2d3-4010-89ae-b1d1df678fc3
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

{"id":"msg_09f16503-1385-46b6-8ed8-73cc366fb4f9","conversationId":"cnv_0de93a9e-16a6-492f-9aeb-4f229da039df","sender":"qa-ecb4fcd1b7c6","body":"4","createdAt":"2026-11-06T09:30:34.120879595Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_0de93a9e-16a6-492f-9aeb-4f229da039df/messages
correlation: qa-994196ea-97ed-4b08-99fb-bd318f3364a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-994196ea-97ed-4b08-99fb-bd318f3364a8
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-994196ea-97ed-4b08-99fb-bd318f3364a8
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

{"id":"msg_275f1213-58dc-4472-ae59-eab62e56826e","conversationId":"cnv_0de93a9e-16a6-492f-9aeb-4f229da039df","sender":"qa-ecb4fcd1b7c6","body":"5","createdAt":"2026-11-06T09:30:34.149031980Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-06a56ace-3833-47ed-ae7b-708cb2e7773e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06a56ace-3833-47ed-ae7b-708cb2e7773e
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-06a56ace-3833-47ed-ae7b-708cb2e7773e
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

{"balance":0,"currency":"credits","accountId":"acc_0926f372-2aa0-4c36-a895-7f704b2c885f"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-65a0f563-e6fd-4b4f-974b-6b5039001d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65a0f563-e6fd-4b4f-974b-6b5039001d09
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f92e0b83920e","subject":"One more","message":"Hi"}

--- response: 402 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65a0f563-e6fd-4b4f-974b-6b5039001d09
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-65a0f563-e6fd-4b4f-974b-6b5039001d09"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5399a0c1-1b11-41c6-a585-3d3fea4b7933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5399a0c1-1b11-41c6-a585-3d3fea4b7933
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5399a0c1-1b11-41c6-a585-3d3fea4b7933
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

{"items":[{"id":"led_6d8a32fc-b763-4f58-9b9a-d9ef7aa7a73e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-06T09:30:33.824430726Z"},{"id":"led_b0001e4d-74d0-48cf-bee2-702cead2330b","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_0de93a9e-16a6-492f-9aeb-4f229da039df","createdAt":"2026-11-06T09:30:34.019852059Z"},{"id":"led_bba0a921-f1d8-42b7-acba-9e216d914d16","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_d093bd0e-0bf4-4872-81cc-867d763e5ec0","createdAt":"2026-11-06T09:30:34.052402129Z"},{"id":"led_b3a2d225-7243-4c8c-8336-4cc9986f2a2d","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_8e7d3659-bdcb-4c1b-ba45-6654fcf98486","createdAt":"2026-11-06T09:30:34.084695475Z"},{"id":"led_5721b89a-5101-419f-a626-0588e05f6bb8","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_09f16503-1385-46b6-8ed8-73cc366fb4f9","createdAt":"2026-11-06T09:30:34.120865509Z"},{"id":"led_33591d9a-fc0c-41e2-a7d8-45f05e1a5ec6","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_275f1213-58dc-4472-ae59-eab62e56826e","createdAt":"2026-11-06T09:30:34.149010500Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-28849167-498c-4838-8273-c6324fa2b9dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28849167-498c-4838-8273-c6324fa2b9dc
Content-Type: application/json

--- request body ---
{"handle":"qa-f92e0b83920e","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-28849167-498c-4838-8273-c6324fa2b9dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bad87817-f9a4-4d75-b8ea-bd3eeb677c2d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff4c42e5-ba56-442f-b366-7a571dc6e8ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff4c42e5-ba56-442f-b366-7a571dc6e8ad
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff4c42e5-ba56-442f-b366-7a571dc6e8ad
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
correlation: qa-bed11a4e-1f25-4400-ab47-513d4aaec641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bed11a4e-1f25-4400-ab47-513d4aaec641
Content-Type: application/json

--- request body ---
{"handle":"qa-f92e0b83920e","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bed11a4e-1f25-4400-ab47-513d4aaec641
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bed11a4e-1f25-4400-ab47-513d4aaec641"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a888f0b6-999d-43b3-b67b-106eb3c904f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a888f0b6-999d-43b3-b67b-106eb3c904f2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a888f0b6-999d-43b3-b67b-106eb3c904f2
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
correlation: qa-4a5ecb90-395a-488b-89c7-442168faf788

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a5ecb90-395a-488b-89c7-442168faf788
Content-Type: application/json

--- request body ---
{"handle":"qa-ecb4fcd1b7c6","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a5ecb90-395a-488b-89c7-442168faf788
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a5ecb90-395a-488b-89c7-442168faf788"}
```
