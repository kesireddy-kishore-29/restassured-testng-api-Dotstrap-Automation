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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-f0fae71b-ce3c-4576-81a7-b0b49108764e` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-6c92c9a2-b4b7-43d1-ad65-70a34d3d62d1` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-3a8a2476-c957-4415-b0f1-238f4e158aae` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-b2e6a90d-1d54-4794-8164-ebafbab37e6c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-a0baf917-e83f-40a8-a3d1-99434142a311` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-b7c55087-a210-4692-8757-51c2f54dc061` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-2b490e33-21a2-42aa-8c16-dddfa012a7ad` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-5e6bcd46-bff0-479e-bc87-68952e1b5354` |
| 9 | `GET /v1/credits/balance` | 200 | 10 | `qa-a8bf1225-ec2b-4fbd-9984-868d1f57f0ca` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 6 | `qa-fdec1a75-1801-40db-9625-8cc9327fd276` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-488ace92-bc8f-41fb-9718-b78a4d8795d5` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-b772cf42-eae9-4963-9b82-73026427ac9d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9fd34117-2fa8-449e-b5ef-5c7c27e4cbf9` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-c7e76280-deb4-4823-b017-736e8d51a6ac` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-6d57f447-431d-47e1-b2c0-79f72c7e8457` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-3dd97f56-d727-44fa-9bda-fb41701f3531` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f0fae71b-ce3c-4576-81a7-b0b49108764e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0fae71b-ce3c-4576-81a7-b0b49108764e
Content-Type: application/json

--- request body ---
{"handle":"qa-ed9ebee4bfbf","displayName":"QA ed9ebee4bfbf","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0fae71b-ce3c-4576-81a7-b0b49108764e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-ed9ebee4bfbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a276718f-b8d0-49e7-aaa6-0fd76773d320","handle":"qa-ed9ebee4bfbf","displayName":"QA ed9ebee4bfbf","region":"eu","role":"user","createdAt":"2026-11-12T09:56:42.390412911Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6c92c9a2-b4b7-43d1-ad65-70a34d3d62d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c92c9a2-b4b7-43d1-ad65-70a34d3d62d1
Content-Type: application/json

--- request body ---
{"handle":"qa-03d98bf26be2","displayName":"QA 03d98bf26be2","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c92c9a2-b4b7-43d1-ad65-70a34d3d62d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-03d98bf26be2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6b64312-5d59-43cd-ad58-9a014b2f049e","handle":"qa-03d98bf26be2","displayName":"QA 03d98bf26be2","region":"eu","role":"user","createdAt":"2026-11-12T09:56:42.435803351Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3a8a2476-c957-4415-b0f1-238f4e158aae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a8a2476-c957-4415-b0f1-238f4e158aae
Content-Type: application/json

--- request body ---
{"handle":"qa-ed9ebee4bfbf","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a8a2476-c957-4415-b0f1-238f4e158aae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a276718f-b8d0-49e7-aaa6-0fd76773d320"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b2e6a90d-1d54-4794-8164-ebafbab37e6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2e6a90d-1d54-4794-8164-ebafbab37e6c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-03d98bf26be2","subject":"Many messages","message":"1"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2e6a90d-1d54-4794-8164-ebafbab37e6c
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
Location: /v1/conversations/cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611","subject":"Many messages","status":"open","region":"eu","participants":["qa-ed9ebee4bfbf","qa-03d98bf26be2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:42.486658946Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611/messages
correlation: qa-a0baf917-e83f-40a8-a3d1-99434142a311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0baf917-e83f-40a8-a3d1-99434142a311
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0baf917-e83f-40a8-a3d1-99434142a311
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

{"id":"msg_86d05dae-4301-476b-aac9-fae8f9d8a182","conversationId":"cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611","sender":"qa-ed9ebee4bfbf","body":"2","createdAt":"2026-11-12T09:56:42.531030318Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611/messages
correlation: qa-b7c55087-a210-4692-8757-51c2f54dc061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7c55087-a210-4692-8757-51c2f54dc061
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7c55087-a210-4692-8757-51c2f54dc061
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

{"id":"msg_d964d5d5-6d65-4ff4-bac9-66ac8964868d","conversationId":"cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611","sender":"qa-ed9ebee4bfbf","body":"3","createdAt":"2026-11-12T09:56:42.560547247Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611/messages
correlation: qa-2b490e33-21a2-42aa-8c16-dddfa012a7ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b490e33-21a2-42aa-8c16-dddfa012a7ad
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b490e33-21a2-42aa-8c16-dddfa012a7ad
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

{"id":"msg_569eaee0-82f1-4744-954b-e5fcf81ecc94","conversationId":"cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611","sender":"qa-ed9ebee4bfbf","body":"4","createdAt":"2026-11-12T09:56:42.586735088Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611/messages
correlation: qa-5e6bcd46-bff0-479e-bc87-68952e1b5354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e6bcd46-bff0-479e-bc87-68952e1b5354
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e6bcd46-bff0-479e-bc87-68952e1b5354
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

{"id":"msg_42164a42-9bf7-4c9f-add0-924030ba077f","conversationId":"cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611","sender":"qa-ed9ebee4bfbf","body":"5","createdAt":"2026-11-12T09:56:42.607362993Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a8bf1225-ec2b-4fbd-9984-868d1f57f0ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8bf1225-ec2b-4fbd-9984-868d1f57f0ca
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8bf1225-ec2b-4fbd-9984-868d1f57f0ca
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

{"balance":0,"currency":"credits","accountId":"acc_a276718f-b8d0-49e7-aaa6-0fd76773d320"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611/messages
correlation: qa-fdec1a75-1801-40db-9625-8cc9327fd276

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdec1a75-1801-40db-9625-8cc9327fd276
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fdec1a75-1801-40db-9625-8cc9327fd276
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611/messages","correlationId":"qa-fdec1a75-1801-40db-9625-8cc9327fd276"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-488ace92-bc8f-41fb-9718-b78a4d8795d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488ace92-bc8f-41fb-9718-b78a4d8795d5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-488ace92-bc8f-41fb-9718-b78a4d8795d5
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

{"items":[{"id":"led_b34b60d3-f6c5-4b18-90e5-ac50d4ef28b1","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-12T09:56:42.390431135Z"},{"id":"led_1eadbd89-b7a1-40f9-9471-d1a724a3b850","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_8fa82190-9a1a-4577-ab03-2ff3bb038611","createdAt":"2026-11-12T09:56:42.486645060Z"},{"id":"led_f08789c4-978c-46c8-96d6-c8f54279bd49","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_86d05dae-4301-476b-aac9-fae8f9d8a182","createdAt":"2026-11-12T09:56:42.530989462Z"},{"id":"led_1b1b7766-1eab-45f5-a3ee-5d56dc6eb2f8","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_d964d5d5-6d65-4ff4-bac9-66ac8964868d","createdAt":"2026-11-12T09:56:42.560508525Z"},{"id":"led_155777cb-b923-4b49-aa05-cda91e427f83","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_569eaee0-82f1-4744-954b-e5fcf81ecc94","createdAt":"2026-11-12T09:56:42.586674865Z"},{"id":"led_c99c6d94-db91-44a8-8d4c-b329b1b0c720","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_42164a42-9bf7-4c9f-add0-924030ba077f","createdAt":"2026-11-12T09:56:42.607314372Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b772cf42-eae9-4963-9b82-73026427ac9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b772cf42-eae9-4963-9b82-73026427ac9d
Content-Type: application/json

--- request body ---
{"handle":"qa-03d98bf26be2","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b772cf42-eae9-4963-9b82-73026427ac9d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6b64312-5d59-43cd-ad58-9a014b2f049e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9fd34117-2fa8-449e-b5ef-5c7c27e4cbf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fd34117-2fa8-449e-b5ef-5c7c27e4cbf9
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9fd34117-2fa8-449e-b5ef-5c7c27e4cbf9
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
correlation: qa-c7e76280-deb4-4823-b017-736e8d51a6ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7e76280-deb4-4823-b017-736e8d51a6ac
Content-Type: application/json

--- request body ---
{"handle":"qa-03d98bf26be2","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7e76280-deb4-4823-b017-736e8d51a6ac
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7e76280-deb4-4823-b017-736e8d51a6ac"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d57f447-431d-47e1-b2c0-79f72c7e8457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d57f447-431d-47e1-b2c0-79f72c7e8457
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d57f447-431d-47e1-b2c0-79f72c7e8457
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
correlation: qa-3dd97f56-d727-44fa-9bda-fb41701f3531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dd97f56-d727-44fa-9bda-fb41701f3531
Content-Type: application/json

--- request body ---
{"handle":"qa-ed9ebee4bfbf","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dd97f56-d727-44fa-9bda-fb41701f3531
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3dd97f56-d727-44fa-9bda-fb41701f3531"}
```
