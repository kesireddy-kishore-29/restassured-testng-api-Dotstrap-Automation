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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-56bb4a0b-0799-4129-9651-afa228d55922` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-bfb06ce9-80b3-4a11-b64a-fd8585758922` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-b73b6889-94f8-40f9-9390-586f3e9f5e96` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-ed41e6d4-a05e-40b4-8e8f-adc5a6f0339d` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-de5fb016-998a-42a8-89e9-0e50f2ecb659` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 30 | `qa-d1c8be1d-e193-49e7-b537-9f2153bf5946` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-c0e8c46a-6e95-4240-a7ff-151c92c3036f` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-c0ae33c2-02fd-4048-b562-63af61af53ec` |
| 9 | `GET /v1/credits/balance` | 200 | 12 | `qa-0ca9e13f-7602-4834-9cba-e8d514442b0c` |
| 10 | `POST /v1/conversations` | 402 | 14 | `qa-e5381237-458e-4292-a44c-799be309720a` |
| 11 | `GET /v1/credits/ledger` | 200 | 21 | `qa-d2f3b28f-7d40-48cd-8361-1fea665ce66c` |
| 12 | `POST /v1/auth/token` | 200 | 17 | `qa-e27325f5-2bd5-4c05-85f3-528b85012c6c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0b81aef7-30ef-49fc-af03-9d7c930d370d` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-09d12bc8-1ad6-4b3b-a1d3-dcb2f9db13e1` |
| 15 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-67aeeef8-43ab-4cc2-9a99-357a6e8fe0b9` |
| 16 | `POST /v1/auth/token` | 401 | 4 | `qa-ca81aa55-2731-487c-bb55-2b6170373306` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-56bb4a0b-0799-4129-9651-afa228d55922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56bb4a0b-0799-4129-9651-afa228d55922
Content-Type: application/json

--- request body ---
{"handle":"qa-9ae80eabf410","displayName":"QA 9ae80eabf410","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-56bb4a0b-0799-4129-9651-afa228d55922
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Location: /v1/accounts/qa-9ae80eabf410
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4826bc6e-951e-441c-aa99-8c6faa6edc0e","handle":"qa-9ae80eabf410","displayName":"QA 9ae80eabf410","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.090590136Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bfb06ce9-80b3-4a11-b64a-fd8585758922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb06ce9-80b3-4a11-b64a-fd8585758922
Content-Type: application/json

--- request body ---
{"handle":"qa-5751739b2ae2","displayName":"QA 5751739b2ae2","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfb06ce9-80b3-4a11-b64a-fd8585758922
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
Location: /v1/accounts/qa-5751739b2ae2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c7c8faf-ba69-4bdb-9d1c-7d7c0974c705","handle":"qa-5751739b2ae2","displayName":"QA 5751739b2ae2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.112268855Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b73b6889-94f8-40f9-9390-586f3e9f5e96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b73b6889-94f8-40f9-9390-586f3e9f5e96
Content-Type: application/json

--- request body ---
{"handle":"qa-9ae80eabf410","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b73b6889-94f8-40f9-9390-586f3e9f5e96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4826bc6e-951e-441c-aa99-8c6faa6edc0e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ed41e6d4-a05e-40b4-8e8f-adc5a6f0339d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed41e6d4-a05e-40b4-8e8f-adc5a6f0339d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5751739b2ae2","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed41e6d4-a05e-40b4-8e8f-adc5a6f0339d
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
Location: /v1/conversations/cnv_b533d520-bd72-4632-a23e-a0fae3435a06
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b533d520-bd72-4632-a23e-a0fae3435a06","subject":"Error contract","status":"open","region":"eu","participants":["qa-9ae80eabf410","qa-5751739b2ae2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.167864671Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b533d520-bd72-4632-a23e-a0fae3435a06/messages
correlation: qa-de5fb016-998a-42a8-89e9-0e50f2ecb659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de5fb016-998a-42a8-89e9-0e50f2ecb659
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-de5fb016-998a-42a8-89e9-0e50f2ecb659
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

{"id":"msg_3d51b339-503d-4b35-92ae-11b2326b63c3","conversationId":"cnv_b533d520-bd72-4632-a23e-a0fae3435a06","sender":"qa-9ae80eabf410","body":"2","createdAt":"2026-11-14T09:05:12.197925309Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_b533d520-bd72-4632-a23e-a0fae3435a06/messages
correlation: qa-d1c8be1d-e193-49e7-b537-9f2153bf5946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1c8be1d-e193-49e7-b537-9f2153bf5946
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1c8be1d-e193-49e7-b537-9f2153bf5946
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

{"id":"msg_31383f95-b946-4776-aa2f-700c533b4034","conversationId":"cnv_b533d520-bd72-4632-a23e-a0fae3435a06","sender":"qa-9ae80eabf410","body":"3","createdAt":"2026-11-14T09:05:12.223382911Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b533d520-bd72-4632-a23e-a0fae3435a06/messages
correlation: qa-c0e8c46a-6e95-4240-a7ff-151c92c3036f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0e8c46a-6e95-4240-a7ff-151c92c3036f
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0e8c46a-6e95-4240-a7ff-151c92c3036f
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

{"id":"msg_8eb4681a-a8b5-497a-8e45-3f98e6014ad0","conversationId":"cnv_b533d520-bd72-4632-a23e-a0fae3435a06","sender":"qa-9ae80eabf410","body":"4","createdAt":"2026-11-14T09:05:12.275440581Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_b533d520-bd72-4632-a23e-a0fae3435a06/messages
correlation: qa-c0ae33c2-02fd-4048-b562-63af61af53ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ae33c2-02fd-4048-b562-63af61af53ec
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0ae33c2-02fd-4048-b562-63af61af53ec
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

{"id":"msg_56527619-f73b-4b47-bcad-9086cb3ad33b","conversationId":"cnv_b533d520-bd72-4632-a23e-a0fae3435a06","sender":"qa-9ae80eabf410","body":"5","createdAt":"2026-11-14T09:05:12.303628241Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-0ca9e13f-7602-4834-9cba-e8d514442b0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ca9e13f-7602-4834-9cba-e8d514442b0c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ca9e13f-7602-4834-9cba-e8d514442b0c
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

{"balance":0,"currency":"credits","accountId":"acc_4826bc6e-951e-441c-aa99-8c6faa6edc0e"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-e5381237-458e-4292-a44c-799be309720a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5381237-458e-4292-a44c-799be309720a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5751739b2ae2","subject":"One more","message":"Hi"}

--- response: 402 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5381237-458e-4292-a44c-799be309720a
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-e5381237-458e-4292-a44c-799be309720a"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d2f3b28f-7d40-48cd-8361-1fea665ce66c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2f3b28f-7d40-48cd-8361-1fea665ce66c
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2f3b28f-7d40-48cd-8361-1fea665ce66c
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

{"items":[{"id":"led_003f3159-367f-4c86-9de9-da283c21df41","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-14T09:05:12.090604948Z"},{"id":"led_df087c07-85f8-4530-8fcd-a1beac58b7a8","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_b533d520-bd72-4632-a23e-a0fae3435a06","createdAt":"2026-11-14T09:05:12.167841076Z"},{"id":"led_4e830e8c-8dd1-49ef-8d8a-7389da6ef631","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_3d51b339-503d-4b35-92ae-11b2326b63c3","createdAt":"2026-11-14T09:05:12.197907312Z"},{"id":"led_a33de7d0-b99e-44fe-9919-5c2665746b6e","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_31383f95-b946-4776-aa2f-700c533b4034","createdAt":"2026-11-14T09:05:12.223372655Z"},{"id":"led_38ed20d2-3ecf-4964-a48c-7b92ace6ad22","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_8eb4681a-a8b5-497a-8e45-3f98e6014ad0","createdAt":"2026-11-14T09:05:12.275422604Z"},{"id":"led_70777207-4b38-4e81-9fee-dee3774c7c04","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_56527619-f73b-4b47-bcad-9086cb3ad33b","createdAt":"2026-11-14T09:05:12.303618466Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e27325f5-2bd5-4c05-85f3-528b85012c6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e27325f5-2bd5-4c05-85f3-528b85012c6c
Content-Type: application/json

--- request body ---
{"handle":"qa-5751739b2ae2","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e27325f5-2bd5-4c05-85f3-528b85012c6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c7c8faf-ba69-4bdb-9d1c-7d7c0974c705"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b81aef7-30ef-49fc-af03-9d7c930d370d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b81aef7-30ef-49fc-af03-9d7c930d370d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b81aef7-30ef-49fc-af03-9d7c930d370d
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
correlation: qa-09d12bc8-1ad6-4b3b-a1d3-dcb2f9db13e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09d12bc8-1ad6-4b3b-a1d3-dcb2f9db13e1
Content-Type: application/json

--- request body ---
{"handle":"qa-5751739b2ae2","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09d12bc8-1ad6-4b3b-a1d3-dcb2f9db13e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09d12bc8-1ad6-4b3b-a1d3-dcb2f9db13e1"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67aeeef8-43ab-4cc2-9a99-357a6e8fe0b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67aeeef8-43ab-4cc2-9a99-357a6e8fe0b9
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67aeeef8-43ab-4cc2-9a99-357a6e8fe0b9
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
correlation: qa-ca81aa55-2731-487c-bb55-2b6170373306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca81aa55-2731-487c-bb55-2b6170373306
Content-Type: application/json

--- request body ---
{"handle":"qa-9ae80eabf410","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca81aa55-2731-487c-bb55-2b6170373306
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca81aa55-2731-487c-bb55-2b6170373306"}
```
