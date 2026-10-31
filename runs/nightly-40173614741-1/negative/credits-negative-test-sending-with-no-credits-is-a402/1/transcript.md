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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-34da21c5-1263-4409-b67d-9647bdbe4ed6` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-8bd185a2-5f5c-4d3d-8ba4-c578a2084b17` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-a9f92b80-1ece-4b09-b514-718e35d0b291` |
| 4 | `POST /v1/conversations` | 201 | 55 | `qa-d84d7a88-c885-4de6-93a8-b451074a2533` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-7d0791ab-cfac-475d-be9d-176d88ccf310` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-cc591fde-e7c5-4321-aa79-8fac52d1f3f8` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-e9cf527e-9019-419b-89ea-2f5e0e354c92` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-de7755a6-facf-4b60-bbb8-5f3d1af4f14f` |
| 9 | `GET /v1/credits/balance` | 200 | 15 | `qa-a8c02a45-c553-4c8b-a703-31b05b7fc952` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 14 | `qa-b09b309e-d081-43e7-8cd3-56162571cfe3` |
| 11 | `GET /v1/credits/ledger` | 200 | 25 | `qa-c5012e26-faee-4955-b49d-bcaadafb76af` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-f653d95f-0ab0-434b-87c9-986db3085b37` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-570f8b6e-c813-43be-ae34-aa85b6c64b83` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-790e851b-79ac-4dad-b73c-a3cc746c9b9b` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-cbaabd76-1261-4466-bfa7-f87e705ef211` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-ed8b19a5-f9d2-482c-aa05-b1d2a619b89c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34da21c5-1263-4409-b67d-9647bdbe4ed6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34da21c5-1263-4409-b67d-9647bdbe4ed6
Content-Type: application/json

--- request body ---
{"handle":"qa-eab92b9f2f02","displayName":"QA eab92b9f2f02","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-34da21c5-1263-4409-b67d-9647bdbe4ed6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Location: /v1/accounts/qa-eab92b9f2f02
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c04e69a4-f4cc-4199-92f5-6f051dd823ff","handle":"qa-eab92b9f2f02","displayName":"QA eab92b9f2f02","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.942468629Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8bd185a2-5f5c-4d3d-8ba4-c578a2084b17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd185a2-5f5c-4d3d-8ba4-c578a2084b17
Content-Type: application/json

--- request body ---
{"handle":"qa-e35d108c2ead","displayName":"QA e35d108c2ead","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bd185a2-5f5c-4d3d-8ba4-c578a2084b17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-e35d108c2ead
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b061ada-9ae2-423b-9336-075c24d8012c","handle":"qa-e35d108c2ead","displayName":"QA e35d108c2ead","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.006416241Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a9f92b80-1ece-4b09-b514-718e35d0b291

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9f92b80-1ece-4b09-b514-718e35d0b291
Content-Type: application/json

--- request body ---
{"handle":"qa-eab92b9f2f02","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9f92b80-1ece-4b09-b514-718e35d0b291
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c04e69a4-f4cc-4199-92f5-6f051dd823ff"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d84d7a88-c885-4de6-93a8-b451074a2533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d84d7a88-c885-4de6-93a8-b451074a2533
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e35d108c2ead","subject":"Many messages","message":"1"}

--- response: 201 in 55 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d84d7a88-c885-4de6-93a8-b451074a2533
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
Location: /v1/conversations/cnv_34e17fce-6c5e-4958-b985-930508e3984e
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_34e17fce-6c5e-4958-b985-930508e3984e","subject":"Many messages","status":"open","region":"eu","participants":["qa-eab92b9f2f02","qa-e35d108c2ead"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.092977202Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_34e17fce-6c5e-4958-b985-930508e3984e/messages
correlation: qa-7d0791ab-cfac-475d-be9d-176d88ccf310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d0791ab-cfac-475d-be9d-176d88ccf310
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d0791ab-cfac-475d-be9d-176d88ccf310
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

{"id":"msg_ce47cff7-2b10-4d8c-aac1-ee1e961fb75a","conversationId":"cnv_34e17fce-6c5e-4958-b985-930508e3984e","sender":"qa-eab92b9f2f02","body":"2","createdAt":"2026-10-25T07:40:26.221132538Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_34e17fce-6c5e-4958-b985-930508e3984e/messages
correlation: qa-cc591fde-e7c5-4321-aa79-8fac52d1f3f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc591fde-e7c5-4321-aa79-8fac52d1f3f8
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc591fde-e7c5-4321-aa79-8fac52d1f3f8
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

{"id":"msg_d7b5bb90-621c-4b96-9b39-ac7d120ba359","conversationId":"cnv_34e17fce-6c5e-4958-b985-930508e3984e","sender":"qa-eab92b9f2f02","body":"3","createdAt":"2026-10-25T07:40:26.244815539Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_34e17fce-6c5e-4958-b985-930508e3984e/messages
correlation: qa-e9cf527e-9019-419b-89ea-2f5e0e354c92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9cf527e-9019-419b-89ea-2f5e0e354c92
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9cf527e-9019-419b-89ea-2f5e0e354c92
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

{"id":"msg_c23e0e55-ee1a-4553-b93f-72c285535c57","conversationId":"cnv_34e17fce-6c5e-4958-b985-930508e3984e","sender":"qa-eab92b9f2f02","body":"4","createdAt":"2026-10-25T07:40:26.275819975Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_34e17fce-6c5e-4958-b985-930508e3984e/messages
correlation: qa-de7755a6-facf-4b60-bbb8-5f3d1af4f14f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de7755a6-facf-4b60-bbb8-5f3d1af4f14f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-de7755a6-facf-4b60-bbb8-5f3d1af4f14f
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

{"id":"msg_48494417-b5ab-47bb-85f6-b634148fe0e8","conversationId":"cnv_34e17fce-6c5e-4958-b985-930508e3984e","sender":"qa-eab92b9f2f02","body":"5","createdAt":"2026-10-25T07:40:26.303221716Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a8c02a45-c553-4c8b-a703-31b05b7fc952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8c02a45-c553-4c8b-a703-31b05b7fc952
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8c02a45-c553-4c8b-a703-31b05b7fc952
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

{"balance":0,"currency":"credits","accountId":"acc_c04e69a4-f4cc-4199-92f5-6f051dd823ff"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_34e17fce-6c5e-4958-b985-930508e3984e/messages
correlation: qa-b09b309e-d081-43e7-8cd3-56162571cfe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09b309e-d081-43e7-8cd3-56162571cfe3
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b09b309e-d081-43e7-8cd3-56162571cfe3
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_34e17fce-6c5e-4958-b985-930508e3984e/messages","correlationId":"qa-b09b309e-d081-43e7-8cd3-56162571cfe3"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c5012e26-faee-4955-b49d-bcaadafb76af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5012e26-faee-4955-b49d-bcaadafb76af
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5012e26-faee-4955-b49d-bcaadafb76af
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

{"items":[{"id":"led_c9aaf827-b9ca-44ad-aa99-76fb7df1a1b1","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-25T07:40:25.942480661Z"},{"id":"led_a2e8d710-0975-4d3d-8e36-e5efafe2fe83","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_34e17fce-6c5e-4958-b985-930508e3984e","createdAt":"2026-10-25T07:40:26.092445069Z"},{"id":"led_415905df-042e-413d-a91d-7dc2f6f6ad52","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_ce47cff7-2b10-4d8c-aac1-ee1e961fb75a","createdAt":"2026-10-25T07:40:26.221107562Z"},{"id":"led_4832d1e5-72fc-43d1-bbec-471a08674766","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_d7b5bb90-621c-4b96-9b39-ac7d120ba359","createdAt":"2026-10-25T07:40:26.244755718Z"},{"id":"led_2eaabac3-bd2e-47f9-a843-2d2b34c75233","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_c23e0e55-ee1a-4553-b93f-72c285535c57","createdAt":"2026-10-25T07:40:26.275749643Z"},{"id":"led_37bb8da9-9e4b-4297-8867-168f57a39ae3","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_48494417-b5ab-47bb-85f6-b634148fe0e8","createdAt":"2026-10-25T07:40:26.303180309Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-f653d95f-0ab0-434b-87c9-986db3085b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f653d95f-0ab0-434b-87c9-986db3085b37
Content-Type: application/json

--- request body ---
{"handle":"qa-e35d108c2ead","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f653d95f-0ab0-434b-87c9-986db3085b37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b061ada-9ae2-423b-9336-075c24d8012c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-570f8b6e-c813-43be-ae34-aa85b6c64b83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-570f8b6e-c813-43be-ae34-aa85b6c64b83
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-570f8b6e-c813-43be-ae34-aa85b6c64b83
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
correlation: qa-790e851b-79ac-4dad-b73c-a3cc746c9b9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-790e851b-79ac-4dad-b73c-a3cc746c9b9b
Content-Type: application/json

--- request body ---
{"handle":"qa-e35d108c2ead","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-790e851b-79ac-4dad-b73c-a3cc746c9b9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-790e851b-79ac-4dad-b73c-a3cc746c9b9b"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cbaabd76-1261-4466-bfa7-f87e705ef211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbaabd76-1261-4466-bfa7-f87e705ef211
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cbaabd76-1261-4466-bfa7-f87e705ef211
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
correlation: qa-ed8b19a5-f9d2-482c-aa05-b1d2a619b89c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed8b19a5-f9d2-482c-aa05-b1d2a619b89c
Content-Type: application/json

--- request body ---
{"handle":"qa-eab92b9f2f02","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed8b19a5-f9d2-482c-aa05-b1d2a619b89c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed8b19a5-f9d2-482c-aa05-b1d2a619b89c"}
```
