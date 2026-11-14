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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-4a2ccbd3-1093-4c84-afa7-1e0b436074fa` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-d51fe6e6-4dd9-4272-9ae7-2588f2d5d219` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-0ae4f5de-880a-41c1-bd31-503a2c1c48f8` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-ac3fa82d-48b4-402e-a196-9199c91fdf66` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-4aa367b4-6138-4fd3-8e4f-5dc99d8212f1` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-add67269-aff2-4e8d-b3cb-d11f8f7ee4a7` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-fb410646-2baa-48e0-9f49-8b47c598d3cf` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-1522fc65-fe23-43d8-a92c-95d229e55a51` |
| 9 | `GET /v1/credits/balance` | 200 | 15 | `qa-aba918f8-efb3-4a09-a251-db0ebf23ef56` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 10 | `qa-0d848f02-b25d-40c7-adc1-4a82c11a83ba` |
| 11 | `GET /v1/credits/ledger` | 200 | 8 | `qa-17ba5661-f897-449f-8098-e2377ae1396b` |
| 12 | `POST /v1/auth/token` | 200 | 9 | `qa-ad0e0b2a-3295-4625-8c60-14cce3bc2a91` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-37fd5baf-7ccb-4d53-905f-060d108ad8dc` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-6915b95d-4330-44d8-bd7a-842c3ee0ca4b` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-eccd302d-903c-43b3-a5a1-2098fe53ea0d` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-70facb48-63ed-4a71-8b76-5b55f79d3b58` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4a2ccbd3-1093-4c84-afa7-1e0b436074fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a2ccbd3-1093-4c84-afa7-1e0b436074fa
Content-Type: application/json

--- request body ---
{"handle":"qa-261b05b62505","displayName":"QA 261b05b62505","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a2ccbd3-1093-4c84-afa7-1e0b436074fa
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
Location: /v1/accounts/qa-261b05b62505
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a0b5e61d-50a8-4ea1-98d7-24df6cc319d7","handle":"qa-261b05b62505","displayName":"QA 261b05b62505","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.336336612Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d51fe6e6-4dd9-4272-9ae7-2588f2d5d219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d51fe6e6-4dd9-4272-9ae7-2588f2d5d219
Content-Type: application/json

--- request body ---
{"handle":"qa-3fd991f6e399","displayName":"QA 3fd991f6e399","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d51fe6e6-4dd9-4272-9ae7-2588f2d5d219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-3fd991f6e399
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d18b450-6233-4f3d-8e5f-b02d5fababc2","handle":"qa-3fd991f6e399","displayName":"QA 3fd991f6e399","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.364155425Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0ae4f5de-880a-41c1-bd31-503a2c1c48f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ae4f5de-880a-41c1-bd31-503a2c1c48f8
Content-Type: application/json

--- request body ---
{"handle":"qa-261b05b62505","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ae4f5de-880a-41c1-bd31-503a2c1c48f8
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0b5e61d-50a8-4ea1-98d7-24df6cc319d7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ac3fa82d-48b4-402e-a196-9199c91fdf66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac3fa82d-48b4-402e-a196-9199c91fdf66
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3fd991f6e399","subject":"Many messages","message":"1"}

--- response: 201 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac3fa82d-48b4-402e-a196-9199c91fdf66
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
Location: /v1/conversations/cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb","subject":"Many messages","status":"open","region":"eu","participants":["qa-261b05b62505","qa-3fd991f6e399"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.424727672Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb/messages
correlation: qa-4aa367b4-6138-4fd3-8e4f-5dc99d8212f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aa367b4-6138-4fd3-8e4f-5dc99d8212f1
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aa367b4-6138-4fd3-8e4f-5dc99d8212f1
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

{"id":"msg_b4679cd5-fbc5-4dee-bea0-1b95735a0009","conversationId":"cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb","sender":"qa-261b05b62505","body":"2","createdAt":"2026-11-07T08:54:56.449480813Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb/messages
correlation: qa-add67269-aff2-4e8d-b3cb-d11f8f7ee4a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-add67269-aff2-4e8d-b3cb-d11f8f7ee4a7
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-add67269-aff2-4e8d-b3cb-d11f8f7ee4a7
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

{"id":"msg_b32a4833-cb91-4b7c-a82a-659a2197757c","conversationId":"cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb","sender":"qa-261b05b62505","body":"3","createdAt":"2026-11-07T08:54:56.470110539Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb/messages
correlation: qa-fb410646-2baa-48e0-9f49-8b47c598d3cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb410646-2baa-48e0-9f49-8b47c598d3cf
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb410646-2baa-48e0-9f49-8b47c598d3cf
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

{"id":"msg_4f1cf362-e1f3-4c0b-a1d6-53021865afc6","conversationId":"cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb","sender":"qa-261b05b62505","body":"4","createdAt":"2026-11-07T08:54:56.493306385Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb/messages
correlation: qa-1522fc65-fe23-43d8-a92c-95d229e55a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1522fc65-fe23-43d8-a92c-95d229e55a51
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1522fc65-fe23-43d8-a92c-95d229e55a51
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

{"id":"msg_2caa48cc-db2c-4a7b-8090-e62aeec11cd2","conversationId":"cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb","sender":"qa-261b05b62505","body":"5","createdAt":"2026-11-07T08:54:56.514326561Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-aba918f8-efb3-4a09-a251-db0ebf23ef56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aba918f8-efb3-4a09-a251-db0ebf23ef56
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-aba918f8-efb3-4a09-a251-db0ebf23ef56
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

{"balance":0,"currency":"credits","accountId":"acc_a0b5e61d-50a8-4ea1-98d7-24df6cc319d7"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb/messages
correlation: qa-0d848f02-b25d-40c7-adc1-4a82c11a83ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d848f02-b25d-40c7-adc1-4a82c11a83ba
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d848f02-b25d-40c7-adc1-4a82c11a83ba
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb/messages","correlationId":"qa-0d848f02-b25d-40c7-adc1-4a82c11a83ba"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-17ba5661-f897-449f-8098-e2377ae1396b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ba5661-f897-449f-8098-e2377ae1396b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-17ba5661-f897-449f-8098-e2377ae1396b
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

{"items":[{"id":"led_5db7d5eb-2644-46ca-a0e3-2b3cf8a770f6","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-07T08:54:56.336352726Z"},{"id":"led_3eef62d7-27d7-4a57-921d-6ff717f6bab8","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_7994d5d3-f405-4a73-9851-90f2349fa7bb","createdAt":"2026-11-07T08:54:56.424716816Z"},{"id":"led_7ca34f17-607a-46c4-b27b-4640a30e8889","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_b4679cd5-fbc5-4dee-bea0-1b95735a0009","createdAt":"2026-11-07T08:54:56.449466221Z"},{"id":"led_fb6585d3-2066-425f-98ad-c89c0178f5ba","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_b32a4833-cb91-4b7c-a82a-659a2197757c","createdAt":"2026-11-07T08:54:56.470088005Z"},{"id":"led_d1ba968d-f1ac-4608-b2e7-af1ef01b7122","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_4f1cf362-e1f3-4c0b-a1d6-53021865afc6","createdAt":"2026-11-07T08:54:56.493284792Z"},{"id":"led_e4833036-8fbb-491f-8aa2-28efc1415685","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_2caa48cc-db2c-4a7b-8090-e62aeec11cd2","createdAt":"2026-11-07T08:54:56.514292379Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-ad0e0b2a-3295-4625-8c60-14cce3bc2a91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad0e0b2a-3295-4625-8c60-14cce3bc2a91
Content-Type: application/json

--- request body ---
{"handle":"qa-3fd991f6e399","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad0e0b2a-3295-4625-8c60-14cce3bc2a91
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d18b450-6233-4f3d-8e5f-b02d5fababc2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37fd5baf-7ccb-4d53-905f-060d108ad8dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37fd5baf-7ccb-4d53-905f-060d108ad8dc
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37fd5baf-7ccb-4d53-905f-060d108ad8dc
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
correlation: qa-6915b95d-4330-44d8-bd7a-842c3ee0ca4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6915b95d-4330-44d8-bd7a-842c3ee0ca4b
Content-Type: application/json

--- request body ---
{"handle":"qa-3fd991f6e399","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6915b95d-4330-44d8-bd7a-842c3ee0ca4b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6915b95d-4330-44d8-bd7a-842c3ee0ca4b"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eccd302d-903c-43b3-a5a1-2098fe53ea0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eccd302d-903c-43b3-a5a1-2098fe53ea0d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eccd302d-903c-43b3-a5a1-2098fe53ea0d
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
correlation: qa-70facb48-63ed-4a71-8b76-5b55f79d3b58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70facb48-63ed-4a71-8b76-5b55f79d3b58
Content-Type: application/json

--- request body ---
{"handle":"qa-261b05b62505","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70facb48-63ed-4a71-8b76-5b55f79d3b58
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70facb48-63ed-4a71-8b76-5b55f79d3b58"}
```
