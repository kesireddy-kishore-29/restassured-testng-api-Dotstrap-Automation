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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-5a70d249-e00f-476e-ab7f-56d28b4a8f28` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-e5c8fae0-af9f-46c8-be5f-c72ee263afbc` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-6080c706-11bb-4d7f-a06c-e90d1de6270f` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-cecc20fa-b560-4787-86b5-5ffa0210fb15` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-db4de9c6-0137-43b1-87bc-318c70fc0520` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-2a9b4b11-9405-4be2-a096-68dddf135271` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-83f1484c-cf3e-499a-9b05-fc0f60a6ff2b` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-02c61d89-eee0-463a-96e8-a7e22b1e211e` |
| 9 | `GET /v1/credits/balance` | 200 | 14 | `qa-91902a9f-63de-4285-b402-91b3c95cf48f` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 21 | `qa-0c2f13ce-76ee-442d-91db-5aee5138fee6` |
| 11 | `GET /v1/credits/ledger` | 200 | 24 | `qa-eb195089-b8a8-4e25-a50d-61243c3e16ea` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-a6e1b2be-29df-4513-ac74-36a0bfd221d6` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e768fcd0-7833-4a6f-908b-79300e213ebe` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-1ae6738e-e5be-49d4-bff1-3c050aa4507f` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0179193f-c133-4f24-98ef-c90fdd86b48c` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-f26ac60a-c243-4dff-9282-6d3b6f35f71a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a70d249-e00f-476e-ab7f-56d28b4a8f28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a70d249-e00f-476e-ab7f-56d28b4a8f28
Content-Type: application/json

--- request body ---
{"handle":"qa-99b45bc3525f","displayName":"QA 99b45bc3525f","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a70d249-e00f-476e-ab7f-56d28b4a8f28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Location: /v1/accounts/qa-99b45bc3525f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2f4f1663-3d36-4b40-b9bb-5ed93968013d","handle":"qa-99b45bc3525f","displayName":"QA 99b45bc3525f","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.204910607Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e5c8fae0-af9f-46c8-be5f-c72ee263afbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5c8fae0-af9f-46c8-be5f-c72ee263afbc
Content-Type: application/json

--- request body ---
{"handle":"qa-564fb1af2d52","displayName":"QA 564fb1af2d52","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5c8fae0-af9f-46c8-be5f-c72ee263afbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-564fb1af2d52
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b20cb8e1-b2d7-45ce-b67c-fec81c101f5a","handle":"qa-564fb1af2d52","displayName":"QA 564fb1af2d52","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.252354634Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6080c706-11bb-4d7f-a06c-e90d1de6270f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6080c706-11bb-4d7f-a06c-e90d1de6270f
Content-Type: application/json

--- request body ---
{"handle":"qa-99b45bc3525f","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6080c706-11bb-4d7f-a06c-e90d1de6270f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f4f1663-3d36-4b40-b9bb-5ed93968013d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cecc20fa-b560-4787-86b5-5ffa0210fb15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cecc20fa-b560-4787-86b5-5ffa0210fb15
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-564fb1af2d52","subject":"Many messages","message":"1"}

--- response: 201 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-cecc20fa-b560-4787-86b5-5ffa0210fb15
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
Location: /v1/conversations/cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe","subject":"Many messages","status":"open","region":"eu","participants":["qa-99b45bc3525f","qa-564fb1af2d52"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.362367458Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe/messages
correlation: qa-db4de9c6-0137-43b1-87bc-318c70fc0520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db4de9c6-0137-43b1-87bc-318c70fc0520
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-db4de9c6-0137-43b1-87bc-318c70fc0520
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

{"id":"msg_bc19846f-a23b-493d-9b85-0a018f994055","conversationId":"cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe","sender":"qa-99b45bc3525f","body":"2","createdAt":"2026-11-05T09:37:55.409051971Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe/messages
correlation: qa-2a9b4b11-9405-4be2-a096-68dddf135271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a9b4b11-9405-4be2-a096-68dddf135271
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a9b4b11-9405-4be2-a096-68dddf135271
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

{"id":"msg_1429ccdc-cdae-44ad-bbf9-4c7b71467a37","conversationId":"cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe","sender":"qa-99b45bc3525f","body":"3","createdAt":"2026-11-05T09:37:55.448115808Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe/messages
correlation: qa-83f1484c-cf3e-499a-9b05-fc0f60a6ff2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83f1484c-cf3e-499a-9b05-fc0f60a6ff2b
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-83f1484c-cf3e-499a-9b05-fc0f60a6ff2b
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

{"id":"msg_f4c12a33-dc6b-4642-86fc-2594f96a7845","conversationId":"cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe","sender":"qa-99b45bc3525f","body":"4","createdAt":"2026-11-05T09:37:55.467412068Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe/messages
correlation: qa-02c61d89-eee0-463a-96e8-a7e22b1e211e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c61d89-eee0-463a-96e8-a7e22b1e211e
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-02c61d89-eee0-463a-96e8-a7e22b1e211e
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

{"id":"msg_ecd51ba3-fc82-4fe5-bab9-a28fa6e78f07","conversationId":"cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe","sender":"qa-99b45bc3525f","body":"5","createdAt":"2026-11-05T09:37:55.500063433Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-91902a9f-63de-4285-b402-91b3c95cf48f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91902a9f-63de-4285-b402-91b3c95cf48f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-91902a9f-63de-4285-b402-91b3c95cf48f
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

{"balance":0,"currency":"credits","accountId":"acc_2f4f1663-3d36-4b40-b9bb-5ed93968013d"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe/messages
correlation: qa-0c2f13ce-76ee-442d-91db-5aee5138fee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c2f13ce-76ee-442d-91db-5aee5138fee6
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c2f13ce-76ee-442d-91db-5aee5138fee6
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe/messages","correlationId":"qa-0c2f13ce-76ee-442d-91db-5aee5138fee6"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-eb195089-b8a8-4e25-a50d-61243c3e16ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb195089-b8a8-4e25-a50d-61243c3e16ea
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb195089-b8a8-4e25-a50d-61243c3e16ea
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

{"items":[{"id":"led_edd428ca-abac-415e-b0a7-3b213236e9a3","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-05T09:37:55.204930110Z"},{"id":"led_adff13ce-0533-46da-9c50-c54a29b9bfdc","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_ec4cdcc0-fbae-4e9d-b6c1-b090164a0bbe","createdAt":"2026-11-05T09:37:55.362333733Z"},{"id":"led_379c16ae-7506-4279-803e-a55c226108e8","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_bc19846f-a23b-493d-9b85-0a018f994055","createdAt":"2026-11-05T09:37:55.409012815Z"},{"id":"led_e30882b2-eb34-4091-8007-7560f52db219","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_1429ccdc-cdae-44ad-bbf9-4c7b71467a37","createdAt":"2026-11-05T09:37:55.448079814Z"},{"id":"led_4d010fce-b350-45fc-b46d-6d8ec9249c5f","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_f4c12a33-dc6b-4642-86fc-2594f96a7845","createdAt":"2026-11-05T09:37:55.467399007Z"},{"id":"led_a4b0b190-43db-4f82-ae27-4071f8b5f8cd","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_ecd51ba3-fc82-4fe5-bab9-a28fa6e78f07","createdAt":"2026-11-05T09:37:55.500031707Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a6e1b2be-29df-4513-ac74-36a0bfd221d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6e1b2be-29df-4513-ac74-36a0bfd221d6
Content-Type: application/json

--- request body ---
{"handle":"qa-564fb1af2d52","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e1b2be-29df-4513-ac74-36a0bfd221d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b20cb8e1-b2d7-45ce-b67c-fec81c101f5a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e768fcd0-7833-4a6f-908b-79300e213ebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e768fcd0-7833-4a6f-908b-79300e213ebe
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e768fcd0-7833-4a6f-908b-79300e213ebe
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
correlation: qa-1ae6738e-e5be-49d4-bff1-3c050aa4507f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ae6738e-e5be-49d4-bff1-3c050aa4507f
Content-Type: application/json

--- request body ---
{"handle":"qa-564fb1af2d52","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ae6738e-e5be-49d4-bff1-3c050aa4507f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ae6738e-e5be-49d4-bff1-3c050aa4507f"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0179193f-c133-4f24-98ef-c90fdd86b48c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0179193f-c133-4f24-98ef-c90fdd86b48c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0179193f-c133-4f24-98ef-c90fdd86b48c
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
correlation: qa-f26ac60a-c243-4dff-9282-6d3b6f35f71a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26ac60a-c243-4dff-9282-6d3b6f35f71a
Content-Type: application/json

--- request body ---
{"handle":"qa-99b45bc3525f","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f26ac60a-c243-4dff-9282-6d3b6f35f71a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f26ac60a-c243-4dff-9282-6d3b6f35f71a"}
```
