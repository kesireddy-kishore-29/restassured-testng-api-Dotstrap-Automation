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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-b3f907c2-cca4-44de-8a74-60d9f7da9709` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-b610d8e9-de52-4599-8a44-5c8cf5ce2c3f` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-aaccd0ba-a3ed-44e9-905e-94ed9f01ad1a` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-7a4c78ee-ddac-4fdc-8811-eb22b92f9c50` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-aedfecce-a43d-44cf-96e2-431b4b124244` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-ce17daad-1dbb-47c5-aa3a-81d4375b623e` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-42af716f-41b7-49a2-b331-8df3e22c46e5` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-1346eb65-5f3b-496b-908d-2f99a630cf13` |
| 9 | `GET /v1/credits/balance` | 200 | 11 | `qa-023ce3ec-3571-4de9-8945-2be46935958d` |
| 10 | `POST /v1/conversations` | 402 | 3 | `qa-ee061fbc-48e5-4cdb-ac34-d6e8a7a5bff3` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-377026b2-f631-443b-9f29-2c42a0a09ffa` |
| 12 | `POST /v1/auth/token` | 200 | 5 | `qa-259e434e-b9fa-411f-b057-55835c566804` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e2b02764-eec5-4ce3-88f3-5d63b2d65d79` |
| 14 | `POST /v1/auth/token` | 401 | 3 | `qa-6ade0c0b-4e06-4a42-a4d6-bba23ccf7fd6` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b72fa602-789b-4c03-a5e5-86529c12a707` |
| 16 | `POST /v1/auth/token` | 401 | 10 | `qa-255b84a1-019d-40df-ad77-320c5c093193` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3f907c2-cca4-44de-8a74-60d9f7da9709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3f907c2-cca4-44de-8a74-60d9f7da9709
Content-Type: application/json

--- request body ---
{"handle":"qa-9c6758a26856","displayName":"QA 9c6758a26856","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3f907c2-cca4-44de-8a74-60d9f7da9709
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Location: /v1/accounts/qa-9c6758a26856
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9568a5d3-1988-4856-882d-6e3d99523d45","handle":"qa-9c6758a26856","displayName":"QA 9c6758a26856","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.125719518Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b610d8e9-de52-4599-8a44-5c8cf5ce2c3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b610d8e9-de52-4599-8a44-5c8cf5ce2c3f
Content-Type: application/json

--- request body ---
{"handle":"qa-b8dd77ddcfc3","displayName":"QA b8dd77ddcfc3","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b610d8e9-de52-4599-8a44-5c8cf5ce2c3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Location: /v1/accounts/qa-b8dd77ddcfc3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_957182d5-9bdb-4363-aaab-214aa0105b61","handle":"qa-b8dd77ddcfc3","displayName":"QA b8dd77ddcfc3","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.150488179Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aaccd0ba-a3ed-44e9-905e-94ed9f01ad1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaccd0ba-a3ed-44e9-905e-94ed9f01ad1a
Content-Type: application/json

--- request body ---
{"handle":"qa-9c6758a26856","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaccd0ba-a3ed-44e9-905e-94ed9f01ad1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9568a5d3-1988-4856-882d-6e3d99523d45"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7a4c78ee-ddac-4fdc-8811-eb22b92f9c50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a4c78ee-ddac-4fdc-8811-eb22b92f9c50
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8dd77ddcfc3","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a4c78ee-ddac-4fdc-8811-eb22b92f9c50
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
Location: /v1/conversations/cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c6758a26856","qa-b8dd77ddcfc3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.208243911Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa/messages
correlation: qa-aedfecce-a43d-44cf-96e2-431b4b124244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aedfecce-a43d-44cf-96e2-431b4b124244
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-aedfecce-a43d-44cf-96e2-431b4b124244
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

{"id":"msg_f8958429-b863-4b02-859b-ba4ab1cc7519","conversationId":"cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa","sender":"qa-9c6758a26856","body":"2","createdAt":"2026-11-08T09:09:03.243704748Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa/messages
correlation: qa-ce17daad-1dbb-47c5-aa3a-81d4375b623e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce17daad-1dbb-47c5-aa3a-81d4375b623e
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce17daad-1dbb-47c5-aa3a-81d4375b623e
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

{"id":"msg_c22cd0d3-0b5c-4656-b64c-4eefc4bb0d82","conversationId":"cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa","sender":"qa-9c6758a26856","body":"3","createdAt":"2026-11-08T09:09:03.279852832Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa/messages
correlation: qa-42af716f-41b7-49a2-b331-8df3e22c46e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42af716f-41b7-49a2-b331-8df3e22c46e5
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-42af716f-41b7-49a2-b331-8df3e22c46e5
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

{"id":"msg_fb30b971-5bf4-47b1-9441-a1883212c490","conversationId":"cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa","sender":"qa-9c6758a26856","body":"4","createdAt":"2026-11-08T09:09:03.302257023Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa/messages
correlation: qa-1346eb65-5f3b-496b-908d-2f99a630cf13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1346eb65-5f3b-496b-908d-2f99a630cf13
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1346eb65-5f3b-496b-908d-2f99a630cf13
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

{"id":"msg_9331c673-bdef-49a7-babc-d10225cd8aa6","conversationId":"cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa","sender":"qa-9c6758a26856","body":"5","createdAt":"2026-11-08T09:09:03.319457155Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-023ce3ec-3571-4de9-8945-2be46935958d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-023ce3ec-3571-4de9-8945-2be46935958d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-023ce3ec-3571-4de9-8945-2be46935958d
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

{"balance":0,"currency":"credits","accountId":"acc_9568a5d3-1988-4856-882d-6e3d99523d45"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-ee061fbc-48e5-4cdb-ac34-d6e8a7a5bff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee061fbc-48e5-4cdb-ac34-d6e8a7a5bff3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8dd77ddcfc3","subject":"One more","message":"Hi"}

--- response: 402 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee061fbc-48e5-4cdb-ac34-d6e8a7a5bff3
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-ee061fbc-48e5-4cdb-ac34-d6e8a7a5bff3"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-377026b2-f631-443b-9f29-2c42a0a09ffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-377026b2-f631-443b-9f29-2c42a0a09ffa
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-377026b2-f631-443b-9f29-2c42a0a09ffa
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

{"items":[{"id":"led_c331349f-d038-4030-8b63-bebc93844a7e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-08T09:09:03.125725197Z"},{"id":"led_26d92e59-ff88-4a54-bdcb-75a68c44d074","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_4131e20a-dc85-48d8-94d4-4ce1f8e4d8aa","createdAt":"2026-11-08T09:09:03.208235859Z"},{"id":"led_02e86c7a-853c-4d9b-9833-b9a45fad70b1","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_f8958429-b863-4b02-859b-ba4ab1cc7519","createdAt":"2026-11-08T09:09:03.243695614Z"},{"id":"led_b1cb3668-86a7-4e1b-b757-8a448653907d","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_c22cd0d3-0b5c-4656-b64c-4eefc4bb0d82","createdAt":"2026-11-08T09:09:03.279847554Z"},{"id":"led_d19c2621-a2e3-416e-a1d5-99a0eb7d0c2f","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_fb30b971-5bf4-47b1-9441-a1883212c490","createdAt":"2026-11-08T09:09:03.302248189Z"},{"id":"led_df378835-34db-4822-8141-f48a4c937611","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_9331c673-bdef-49a7-babc-d10225cd8aa6","createdAt":"2026-11-08T09:09:03.319452938Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-259e434e-b9fa-411f-b057-55835c566804

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-259e434e-b9fa-411f-b057-55835c566804
Content-Type: application/json

--- request body ---
{"handle":"qa-b8dd77ddcfc3","password":"****"}

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-259e434e-b9fa-411f-b057-55835c566804
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_957182d5-9bdb-4363-aaab-214aa0105b61"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2b02764-eec5-4ce3-88f3-5d63b2d65d79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2b02764-eec5-4ce3-88f3-5d63b2d65d79
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2b02764-eec5-4ce3-88f3-5d63b2d65d79
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
correlation: qa-6ade0c0b-4e06-4a42-a4d6-bba23ccf7fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ade0c0b-4e06-4a42-a4d6-bba23ccf7fd6
Content-Type: application/json

--- request body ---
{"handle":"qa-b8dd77ddcfc3","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ade0c0b-4e06-4a42-a4d6-bba23ccf7fd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ade0c0b-4e06-4a42-a4d6-bba23ccf7fd6"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b72fa602-789b-4c03-a5e5-86529c12a707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b72fa602-789b-4c03-a5e5-86529c12a707
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b72fa602-789b-4c03-a5e5-86529c12a707
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
correlation: qa-255b84a1-019d-40df-ad77-320c5c093193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-255b84a1-019d-40df-ad77-320c5c093193
Content-Type: application/json

--- request body ---
{"handle":"qa-9c6758a26856","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-255b84a1-019d-40df-ad77-320c5c093193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-255b84a1-019d-40df-ad77-320c5c093193"}
```
