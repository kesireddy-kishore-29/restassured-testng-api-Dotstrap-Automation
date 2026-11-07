# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 445 | `qa-651cfdbf-088f-4259-86c6-ed7e7bee9ab8` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-af551117-dacb-447a-bf67-fd8d48d3bcb2` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-9fc77829-88d5-4dda-bd68-b2495413277f` |
| 4 | `POST /v1/credits/purchases` | 201 | 35 | `qa-e71cf188-a0f8-4fed-8af3-f10f1751f637` |
| 5 | `POST /v1/auth/token` | 200 | 31 | `qa-6a0ecb82-707d-44c4-9f9d-14b8c63ca7da` |
| 6 | `POST /v1/credits/purchases` | 201 | 18 | `qa-415e103c-c2c6-4b0e-ba55-31da53e9852e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-94154560-dabd-40fc-9387-ffe44ccb5cc9` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-448a60da-760c-4139-b2a4-9696ebc71fea` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-bbe86a6a-30cd-4d60-87a4-5fa046bc4b48` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-37ef6aed-b4d8-40eb-9b51-23995f939a1c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-651cfdbf-088f-4259-86c6-ed7e7bee9ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-651cfdbf-088f-4259-86c6-ed7e7bee9ab8
Content-Type: application/json

--- request body ---
{"handle":"qa-325c4584edb1","displayName":"QA 325c4584edb1","password":"****","region":"eu"}

--- response: 201 in 445 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-651cfdbf-088f-4259-86c6-ed7e7bee9ab8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-325c4584edb1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_110006cf-f52b-4ab7-9d28-640ce6d3d110","handle":"qa-325c4584edb1","displayName":"QA 325c4584edb1","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.008627193Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-af551117-dacb-447a-bf67-fd8d48d3bcb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af551117-dacb-447a-bf67-fd8d48d3bcb2
Content-Type: application/json

--- request body ---
{"handle":"qa-b0880e7f2b91","displayName":"QA b0880e7f2b91","password":"****","region":"us"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-af551117-dacb-447a-bf67-fd8d48d3bcb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-b0880e7f2b91
X-Served-Region: us
Content-Length: 181

{"id":"acc_79856d33-fd57-4a47-b3e5-84c22aa4ad04","handle":"qa-b0880e7f2b91","displayName":"QA b0880e7f2b91","region":"us","role":"user","createdAt":"2026-11-06T09:30:31.493127051Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9fc77829-88d5-4dda-bd68-b2495413277f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc77829-88d5-4dda-bd68-b2495413277f
Content-Type: application/json

--- request body ---
{"handle":"qa-325c4584edb1","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fc77829-88d5-4dda-bd68-b2495413277f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_110006cf-f52b-4ab7-9d28-640ce6d3d110"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e71cf188-a0f8-4fed-8af3-f10f1751f637

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ae85297d482f4dd29a56272819fafaca
X-Correlation-Id: qa-e71cf188-a0f8-4fed-8af3-f10f1751f637
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e71cf188-a0f8-4fed-8af3-f10f1751f637
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
Location: /v1/credits/purchases/pur_56d74dfc-1add-4a14-ae43-4eaf7be3d6a3
Content-Length: 144

{"id":"pur_56d74dfc-1add-4a14-ae43-4eaf7be3d6a3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.652544529Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6a0ecb82-707d-44c4-9f9d-14b8c63ca7da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a0ecb82-707d-44c4-9f9d-14b8c63ca7da
Content-Type: application/json

--- request body ---
{"handle":"qa-b0880e7f2b91","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a0ecb82-707d-44c4-9f9d-14b8c63ca7da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79856d33-fd57-4a47-b3e5-84c22aa4ad04"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-415e103c-c2c6-4b0e-ba55-31da53e9852e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ae85297d482f4dd29a56272819fafaca
X-Correlation-Id: qa-415e103c-c2c6-4b0e-ba55-31da53e9852e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-415e103c-c2c6-4b0e-ba55-31da53e9852e
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_1e1cdff7-c5e3-4376-be2a-19b6e8b94d48
Content-Length: 144

{"id":"pur_1e1cdff7-c5e3-4376-be2a-19b6e8b94d48","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.772164396Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94154560-dabd-40fc-9387-ffe44ccb5cc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94154560-dabd-40fc-9387-ffe44ccb5cc9
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94154560-dabd-40fc-9387-ffe44ccb5cc9
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-448a60da-760c-4139-b2a4-9696ebc71fea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-448a60da-760c-4139-b2a4-9696ebc71fea
Content-Type: application/json

--- request body ---
{"handle":"qa-b0880e7f2b91","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-448a60da-760c-4139-b2a4-9696ebc71fea
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-448a60da-760c-4139-b2a4-9696ebc71fea"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bbe86a6a-30cd-4d60-87a4-5fa046bc4b48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbe86a6a-30cd-4d60-87a4-5fa046bc4b48
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bbe86a6a-30cd-4d60-87a4-5fa046bc4b48
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-37ef6aed-b4d8-40eb-9b51-23995f939a1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ef6aed-b4d8-40eb-9b51-23995f939a1c
Content-Type: application/json

--- request body ---
{"handle":"qa-325c4584edb1","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37ef6aed-b4d8-40eb-9b51-23995f939a1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37ef6aed-b4d8-40eb-9b51-23995f939a1c"}
```
