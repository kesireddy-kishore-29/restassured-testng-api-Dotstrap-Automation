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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-f18aaef5-9749-4403-84cb-220d871e87af` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-b0d895ce-96ef-46fa-a2c6-f78f56df7707` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-72cbe2c3-6a94-4861-8660-9a896b54630b` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-4c390bbf-9565-4d08-a35a-16fd236b9378` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-fc764875-160c-4daa-83ef-4ddd2f1502c7` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-5ac7a072-9fab-4248-8cfd-2b6583f772ec` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-278eb414-bce8-4e4c-b396-8c3eb4285772` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-26cc6f26-f74e-42cf-873c-3099b44cb95f` |
| 9 | `GET /v1/credits/balance` | 200 | 14 | `qa-93739f56-a4f0-4906-9879-75b619417eb1` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 16 | `qa-1c3d3914-55f5-4ba4-baed-452d6f1b1e4a` |
| 11 | `GET /v1/credits/ledger` | 200 | 14 | `qa-4204ed92-0396-4dd7-b42c-0900fa96216a` |
| 12 | `POST /v1/auth/token` | 200 | 18 | `qa-1791f235-0ea6-4a01-9d2b-1fe56f6c6660` |
| 13 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-28dc5685-3ade-4663-b8c9-24ddea67c140` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-57770185-c0eb-4d33-a3e7-872a25f826fa` |
| 15 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-00981165-508a-4ae5-999c-8a64808fff7f` |
| 16 | `POST /v1/auth/token` | 401 | 12 | `qa-17dc9437-f92c-4edd-96a7-c2d5ffa4d307` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f18aaef5-9749-4403-84cb-220d871e87af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f18aaef5-9749-4403-84cb-220d871e87af
Content-Type: application/json

--- request body ---
{"handle":"qa-02623750ed27","displayName":"QA 02623750ed27","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f18aaef5-9749-4403-84cb-220d871e87af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 8
Location: /v1/accounts/qa-02623750ed27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2efe4d1f-dd53-4f3a-8366-a6e8401f2e84","handle":"qa-02623750ed27","displayName":"QA 02623750ed27","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.202160321Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b0d895ce-96ef-46fa-a2c6-f78f56df7707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0d895ce-96ef-46fa-a2c6-f78f56df7707
Content-Type: application/json

--- request body ---
{"handle":"qa-364290f4e6f3","displayName":"QA 364290f4e6f3","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0d895ce-96ef-46fa-a2c6-f78f56df7707
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 8
Location: /v1/accounts/qa-364290f4e6f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5576573d-3d4a-4e40-b5aa-fd69a4b7ba85","handle":"qa-364290f4e6f3","displayName":"QA 364290f4e6f3","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.258221868Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-72cbe2c3-6a94-4861-8660-9a896b54630b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72cbe2c3-6a94-4861-8660-9a896b54630b
Content-Type: application/json

--- request body ---
{"handle":"qa-02623750ed27","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-72cbe2c3-6a94-4861-8660-9a896b54630b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2efe4d1f-dd53-4f3a-8366-a6e8401f2e84"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4c390bbf-9565-4d08-a35a-16fd236b9378

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c390bbf-9565-4d08-a35a-16fd236b9378
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-364290f4e6f3","subject":"Many messages","message":"1"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c390bbf-9565-4d08-a35a-16fd236b9378
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
Location: /v1/conversations/cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5","subject":"Many messages","status":"open","region":"eu","participants":["qa-02623750ed27","qa-364290f4e6f3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:43.322055045Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5/messages
correlation: qa-fc764875-160c-4daa-83ef-4ddd2f1502c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc764875-160c-4daa-83ef-4ddd2f1502c7
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc764875-160c-4daa-83ef-4ddd2f1502c7
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

{"id":"msg_ce15bdd1-fdd3-4258-909d-20cc1d457be1","conversationId":"cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5","sender":"qa-02623750ed27","body":"2","createdAt":"2026-11-02T09:38:43.352983448Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5/messages
correlation: qa-5ac7a072-9fab-4248-8cfd-2b6583f772ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ac7a072-9fab-4248-8cfd-2b6583f772ec
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ac7a072-9fab-4248-8cfd-2b6583f772ec
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

{"id":"msg_14129120-cb52-4e2f-a76f-82e15642f9f8","conversationId":"cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5","sender":"qa-02623750ed27","body":"3","createdAt":"2026-11-02T09:38:43.403119885Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5/messages
correlation: qa-278eb414-bce8-4e4c-b396-8c3eb4285772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-278eb414-bce8-4e4c-b396-8c3eb4285772
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-278eb414-bce8-4e4c-b396-8c3eb4285772
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

{"id":"msg_25f52e6d-5376-4ad5-9ca7-3d0fc1baf6cd","conversationId":"cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5","sender":"qa-02623750ed27","body":"4","createdAt":"2026-11-02T09:38:43.436064825Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5/messages
correlation: qa-26cc6f26-f74e-42cf-873c-3099b44cb95f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26cc6f26-f74e-42cf-873c-3099b44cb95f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-26cc6f26-f74e-42cf-873c-3099b44cb95f
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

{"id":"msg_b4b48d0a-3b62-4be7-8203-45dffd2730db","conversationId":"cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5","sender":"qa-02623750ed27","body":"5","createdAt":"2026-11-02T09:38:43.468361862Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-93739f56-a4f0-4906-9879-75b619417eb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93739f56-a4f0-4906-9879-75b619417eb1
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-93739f56-a4f0-4906-9879-75b619417eb1
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

{"balance":0,"currency":"credits","accountId":"acc_2efe4d1f-dd53-4f3a-8366-a6e8401f2e84"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5/messages
correlation: qa-1c3d3914-55f5-4ba4-baed-452d6f1b1e4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c3d3914-55f5-4ba4-baed-452d6f1b1e4a
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c3d3914-55f5-4ba4-baed-452d6f1b1e4a
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5/messages","correlationId":"qa-1c3d3914-55f5-4ba4-baed-452d6f1b1e4a"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4204ed92-0396-4dd7-b42c-0900fa96216a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4204ed92-0396-4dd7-b42c-0900fa96216a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-4204ed92-0396-4dd7-b42c-0900fa96216a
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

{"items":[{"id":"led_0f1b1ded-3652-4f11-91d9-9022988ab759","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-02T09:38:43.202180549Z"},{"id":"led_3fc4783a-11a4-462f-8ae6-ac88dbbd3d44","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_ed4d2702-1ebd-4578-8ac4-f8c8d69a9ee5","createdAt":"2026-11-02T09:38:43.321980496Z"},{"id":"led_28fb007f-64f2-42b1-94a0-715979357a50","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_ce15bdd1-fdd3-4258-909d-20cc1d457be1","createdAt":"2026-11-02T09:38:43.352937191Z"},{"id":"led_55f7b1a6-da49-49d2-a926-a3744f4c61c1","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_14129120-cb52-4e2f-a76f-82e15642f9f8","createdAt":"2026-11-02T09:38:43.403076984Z"},{"id":"led_15f9b376-bf64-47dc-9d4f-37bedc0cda4c","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_25f52e6d-5376-4ad5-9ca7-3d0fc1baf6cd","createdAt":"2026-11-02T09:38:43.436027355Z"},{"id":"led_b7e97f2b-f9ef-41b4-9ba8-74753f29c503","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_b4b48d0a-3b62-4be7-8203-45dffd2730db","createdAt":"2026-11-02T09:38:43.468318621Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-1791f235-0ea6-4a01-9d2b-1fe56f6c6660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1791f235-0ea6-4a01-9d2b-1fe56f6c6660
Content-Type: application/json

--- request body ---
{"handle":"qa-364290f4e6f3","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1791f235-0ea6-4a01-9d2b-1fe56f6c6660
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5576573d-3d4a-4e40-b5aa-fd69a4b7ba85"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28dc5685-3ade-4663-b8c9-24ddea67c140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28dc5685-3ade-4663-b8c9-24ddea67c140
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28dc5685-3ade-4663-b8c9-24ddea67c140
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
correlation: qa-57770185-c0eb-4d33-a3e7-872a25f826fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57770185-c0eb-4d33-a3e7-872a25f826fa
Content-Type: application/json

--- request body ---
{"handle":"qa-364290f4e6f3","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57770185-c0eb-4d33-a3e7-872a25f826fa
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57770185-c0eb-4d33-a3e7-872a25f826fa"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00981165-508a-4ae5-999c-8a64808fff7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00981165-508a-4ae5-999c-8a64808fff7f
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00981165-508a-4ae5-999c-8a64808fff7f
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
correlation: qa-17dc9437-f92c-4edd-96a7-c2d5ffa4d307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17dc9437-f92c-4edd-96a7-c2d5ffa4d307
Content-Type: application/json

--- request body ---
{"handle":"qa-02623750ed27","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17dc9437-f92c-4edd-96a7-c2d5ffa4d307
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17dc9437-f92c-4edd-96a7-c2d5ffa4d307"}
```
