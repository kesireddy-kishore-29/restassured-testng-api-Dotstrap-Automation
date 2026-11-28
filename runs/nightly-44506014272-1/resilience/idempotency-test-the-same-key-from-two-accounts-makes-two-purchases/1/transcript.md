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
| 1 | `POST /v1/accounts` | 201 | 373 | `qa-3d5642ea-27f3-481d-8391-68978f322b33` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-f5800869-7049-4859-a3ce-34c099d29d35` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-4428f078-b60d-46d3-b83b-3a6c4d33c6e6` |
| 4 | `POST /v1/credits/purchases` | 201 | 42 | `qa-b0706e4a-5865-4aa7-9fcc-abc9dd47dc12` |
| 5 | `POST /v1/auth/token` | 200 | 18 | `qa-8883f7d1-c64d-4e57-a397-7502f59ad25a` |
| 6 | `POST /v1/credits/purchases` | 201 | 10 | `qa-70fb131b-ba3c-4691-bdb3-3a1d3be273c7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-d9ff6448-0ce8-4796-b143-d4ab7cd7c760` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-aecbcee8-3dc7-4171-ad3d-c163e8bb3eae` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-b81d8128-e619-451d-8da9-46f821835c0c` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-51ec3a96-ecc9-4ec8-912e-6be351fdc7c9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d5642ea-27f3-481d-8391-68978f322b33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d5642ea-27f3-481d-8391-68978f322b33
Content-Type: application/json

--- request body ---
{"handle":"qa-4fe2df2451b4","displayName":"QA 4fe2df2451b4","password":"****","region":"eu"}

--- response: 201 in 373 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d5642ea-27f3-481d-8391-68978f322b33
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
Location: /v1/accounts/qa-4fe2df2451b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6c93102-ef19-47c9-86e4-16a0ee921ab6","handle":"qa-4fe2df2451b4","displayName":"QA 4fe2df2451b4","region":"eu","role":"user","createdAt":"2026-11-19T10:29:12.139863790Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f5800869-7049-4859-a3ce-34c099d29d35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5800869-7049-4859-a3ce-34c099d29d35
Content-Type: application/json

--- request body ---
{"handle":"qa-52bb44d8b3a8","displayName":"QA 52bb44d8b3a8","password":"****","region":"us"}

--- response: 201 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5800869-7049-4859-a3ce-34c099d29d35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-52bb44d8b3a8
X-Served-Region: us
Content-Length: 181

{"id":"acc_df3aa70d-03ac-40f3-99a2-4e683bf5537f","handle":"qa-52bb44d8b3a8","displayName":"QA 52bb44d8b3a8","region":"us","role":"user","createdAt":"2026-11-19T10:29:12.456176696Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4428f078-b60d-46d3-b83b-3a6c4d33c6e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4428f078-b60d-46d3-b83b-3a6c4d33c6e6
Content-Type: application/json

--- request body ---
{"handle":"qa-4fe2df2451b4","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4428f078-b60d-46d3-b83b-3a6c4d33c6e6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6c93102-ef19-47c9-86e4-16a0ee921ab6"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b0706e4a-5865-4aa7-9fcc-abc9dd47dc12

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a4e02852d79c4c3f93d58bb968c243f2
X-Correlation-Id: qa-b0706e4a-5865-4aa7-9fcc-abc9dd47dc12
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0706e4a-5865-4aa7-9fcc-abc9dd47dc12
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
Location: /v1/credits/purchases/pur_e61b70ca-bf9e-4543-aff2-043f3c21c9da
Content-Length: 144

{"id":"pur_e61b70ca-bf9e-4543-aff2-043f3c21c9da","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.592938750Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8883f7d1-c64d-4e57-a397-7502f59ad25a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8883f7d1-c64d-4e57-a397-7502f59ad25a
Content-Type: application/json

--- request body ---
{"handle":"qa-52bb44d8b3a8","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8883f7d1-c64d-4e57-a397-7502f59ad25a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df3aa70d-03ac-40f3-99a2-4e683bf5537f"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70fb131b-ba3c-4691-bdb3-3a1d3be273c7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a4e02852d79c4c3f93d58bb968c243f2
X-Correlation-Id: qa-70fb131b-ba3c-4691-bdb3-3a1d3be273c7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-70fb131b-ba3c-4691-bdb3-3a1d3be273c7
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
Location: /v1/credits/purchases/pur_24889efb-bda3-4211-8581-586261f86b8a
Content-Length: 144

{"id":"pur_24889efb-bda3-4211-8581-586261f86b8a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.661675523Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9ff6448-0ce8-4796-b143-d4ab7cd7c760

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9ff6448-0ce8-4796-b143-d4ab7cd7c760
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9ff6448-0ce8-4796-b143-d4ab7cd7c760
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
correlation: qa-aecbcee8-3dc7-4171-ad3d-c163e8bb3eae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aecbcee8-3dc7-4171-ad3d-c163e8bb3eae
Content-Type: application/json

--- request body ---
{"handle":"qa-52bb44d8b3a8","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aecbcee8-3dc7-4171-ad3d-c163e8bb3eae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aecbcee8-3dc7-4171-ad3d-c163e8bb3eae"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b81d8128-e619-451d-8da9-46f821835c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b81d8128-e619-451d-8da9-46f821835c0c
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b81d8128-e619-451d-8da9-46f821835c0c
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
correlation: qa-51ec3a96-ecc9-4ec8-912e-6be351fdc7c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51ec3a96-ecc9-4ec8-912e-6be351fdc7c9
Content-Type: application/json

--- request body ---
{"handle":"qa-4fe2df2451b4","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51ec3a96-ecc9-4ec8-912e-6be351fdc7c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51ec3a96-ecc9-4ec8-912e-6be351fdc7c9"}
```
