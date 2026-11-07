# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 517 | `qa-845f4461-5d6d-4cb8-bcf6-f83eb6bb11d0` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-804f781c-2e58-4d7e-8f16-8d64d71ba5d6` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-40af6c7e-54c3-4e83-ae68-64a1792b92c6` |
| 4 | `POST /v1/credits/purchases` | 201 | 69 | `qa-9bd51fcc-6aed-4e0e-b714-e314529215d3` |
| 5 | `POST /v1/credits/purchases` | 201 | 23 | `qa-6e855dc0-77d7-4c66-ba43-0cccfd659200` |
| 6 | `POST /v1/conversations` | 201 | 12 | `qa-7ccc4f5d-8924-4462-b6a8-a6c7ca13b376` |
| 7 | `GET /v1/credits/ledger` | 200 | 36 | `qa-52855ffa-5261-4fdb-b3c4-155ba24449af` |
| 8 | `GET /v1/credits/balance` | 200 | 18 | `qa-c950a326-bbc7-4451-a77f-3854e8623411` |
| 9 | `POST /v1/auth/token` | 200 | 23 | `qa-4c98c02d-0c2a-4ac8-9269-132bd11cbb96` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f2c10c41-ba7b-447d-aeae-2c89d4869422` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-f23537b5-9add-4fdf-a80f-b3d8b0a52112` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-cd2b12c7-a4e3-423b-aa30-847fae56215d` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-ad055d62-2788-41fb-a388-9f51e37fb3d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-845f4461-5d6d-4cb8-bcf6-f83eb6bb11d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845f4461-5d6d-4cb8-bcf6-f83eb6bb11d0
Content-Type: application/json

--- request body ---
{"handle":"qa-7fad6277797d","displayName":"QA 7fad6277797d","password":"****","region":"eu"}

--- response: 201 in 517 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-845f4461-5d6d-4cb8-bcf6-f83eb6bb11d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-7fad6277797d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_faee3f7f-4b2c-40d3-83b6-a10d1358c424","handle":"qa-7fad6277797d","displayName":"QA 7fad6277797d","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.557271937Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-804f781c-2e58-4d7e-8f16-8d64d71ba5d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-804f781c-2e58-4d7e-8f16-8d64d71ba5d6
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8be417f752","displayName":"QA 8e8be417f752","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-804f781c-2e58-4d7e-8f16-8d64d71ba5d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-8e8be417f752
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bfba05a4-37b1-45bd-9aac-7e00459bab29","handle":"qa-8e8be417f752","displayName":"QA 8e8be417f752","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.157754768Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-40af6c7e-54c3-4e83-ae68-64a1792b92c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40af6c7e-54c3-4e83-ae68-64a1792b92c6
Content-Type: application/json

--- request body ---
{"handle":"qa-7fad6277797d","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-40af6c7e-54c3-4e83-ae68-64a1792b92c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_faee3f7f-4b2c-40d3-83b6-a10d1358c424"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9bd51fcc-6aed-4e0e-b714-e314529215d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f646f6376cc94ab2bd7087ef49ab0413
X-Correlation-Id: qa-9bd51fcc-6aed-4e0e-b714-e314529215d3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 69 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bd51fcc-6aed-4e0e-b714-e314529215d3
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
Location: /v1/credits/purchases/pur_7b2477af-9f9f-4324-a333-bbf9c6b4a148
Content-Length: 144

{"id":"pur_7b2477af-9f9f-4324-a333-bbf9c6b4a148","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:46:03.351137543Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6e855dc0-77d7-4c66-ba43-0cccfd659200

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c243128550134ca1b2e222251ab2c7db
X-Correlation-Id: qa-6e855dc0-77d7-4c66-ba43-0cccfd659200
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e855dc0-77d7-4c66-ba43-0cccfd659200
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
Location: /v1/credits/purchases/pur_79b3c651-765e-4618-93de-7e175d09b075
Content-Length: 144

{"id":"pur_79b3c651-765e-4618-93de-7e175d09b075","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-30T08:46:03.422234117Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-7ccc4f5d-8924-4462-b6a8-a6c7ca13b376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ccc4f5d-8924-4462-b6a8-a6c7ca13b376
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e8be417f752","subject":"Paid message","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ccc4f5d-8924-4462-b6a8-a6c7ca13b376
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
Location: /v1/conversations/cnv_c52fb41b-d480-49f4-9e3b-560ed938970b
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_c52fb41b-d480-49f4-9e3b-560ed938970b","subject":"Paid message","status":"open","region":"eu","participants":["qa-7fad6277797d","qa-8e8be417f752"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:03.440633798Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-52855ffa-5261-4fdb-b3c4-155ba24449af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52855ffa-5261-4fdb-b3c4-155ba24449af
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-52855ffa-5261-4fdb-b3c4-155ba24449af
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
Content-Length: 791

{"items":[{"id":"led_ca162b2a-9775-4f8e-b23e-b61b78ae4ef9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-30T08:46:02.557283549Z"},{"id":"led_755e2568-d527-4854-9c81-5248ef85ec11","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7b2477af-9f9f-4324-a333-bbf9c6b4a148","createdAt":"2026-10-30T08:46:03.351137543Z"},{"id":"led_f0f72f12-0567-49c9-8d3b-baeffcbfbf57","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_79b3c651-765e-4618-93de-7e175d09b075","createdAt":"2026-10-30T08:46:03.422234117Z"},{"id":"led_4f613c40-2328-4a0f-bc54-6bdafbb13d95","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_c52fb41b-d480-49f4-9e3b-560ed938970b","createdAt":"2026-10-30T08:46:03.440591700Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-c950a326-bbc7-4451-a77f-3854e8623411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c950a326-bbc7-4451-a77f-3854e8623411
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c950a326-bbc7-4451-a77f-3854e8623411
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
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_faee3f7f-4b2c-40d3-83b6-a10d1358c424"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4c98c02d-0c2a-4ac8-9269-132bd11cbb96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c98c02d-0c2a-4ac8-9269-132bd11cbb96
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8be417f752","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c98c02d-0c2a-4ac8-9269-132bd11cbb96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bfba05a4-37b1-45bd-9aac-7e00459bab29"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2c10c41-ba7b-447d-aeae-2c89d4869422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c10c41-ba7b-447d-aeae-2c89d4869422
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2c10c41-ba7b-447d-aeae-2c89d4869422
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-f23537b5-9add-4fdf-a80f-b3d8b0a52112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f23537b5-9add-4fdf-a80f-b3d8b0a52112
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8be417f752","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f23537b5-9add-4fdf-a80f-b3d8b0a52112
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f23537b5-9add-4fdf-a80f-b3d8b0a52112"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd2b12c7-a4e3-423b-aa30-847fae56215d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd2b12c7-a4e3-423b-aa30-847fae56215d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd2b12c7-a4e3-423b-aa30-847fae56215d
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-ad055d62-2788-41fb-a388-9f51e37fb3d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad055d62-2788-41fb-a388-9f51e37fb3d6
Content-Type: application/json

--- request body ---
{"handle":"qa-7fad6277797d","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad055d62-2788-41fb-a388-9f51e37fb3d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad055d62-2788-41fb-a388-9f51e37fb3d6"}
```
