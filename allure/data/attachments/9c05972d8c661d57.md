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
| 1 | `POST /v1/accounts` | 201 | 479 | `qa-6c5592fe-02f0-4f6d-a732-648604071887` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-c6ec780e-8926-434f-a49b-f15da7c8c296` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-07236edc-2986-4f44-abc6-2d9315f4570c` |
| 4 | `POST /v1/credits/purchases` | 201 | 43 | `qa-60c04813-c401-48eb-868f-2cae9cf5f0e1` |
| 5 | `POST /v1/auth/token` | 200 | 32 | `qa-d273ae68-7092-4451-954a-cd5066ba47d8` |
| 6 | `POST /v1/credits/purchases` | 201 | 16 | `qa-bb14a62f-c063-49a4-b5d2-aa09ffec4f79` |
| 7 | `DELETE /v1/accounts/me` | 204 | 45 | `qa-42ddf53c-dbbc-4403-a9e9-0b539082bc7a` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-2638372b-80e2-4de0-bdaa-290ed9cbec65` |
| 9 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-53d70526-d520-4c08-b8f8-0b30c6d9c042` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-2e38adae-c02e-412d-8f58-e87f1313f4b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6c5592fe-02f0-4f6d-a732-648604071887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c5592fe-02f0-4f6d-a732-648604071887
Content-Type: application/json

--- request body ---
{"handle":"qa-4f9d86f15081","displayName":"QA 4f9d86f15081","password":"****","region":"eu"}

--- response: 201 in 479 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c5592fe-02f0-4f6d-a732-648604071887
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
Location: /v1/accounts/qa-4f9d86f15081
X-Served-Region: eu
Content-Length: 181

{"id":"acc_210892b5-5904-4657-a7fb-ceb17bbc5781","handle":"qa-4f9d86f15081","displayName":"QA 4f9d86f15081","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.237603330Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c6ec780e-8926-434f-a49b-f15da7c8c296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6ec780e-8926-434f-a49b-f15da7c8c296
Content-Type: application/json

--- request body ---
{"handle":"qa-b5bdbef35e78","displayName":"QA b5bdbef35e78","password":"****","region":"us"}

--- response: 201 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6ec780e-8926-434f-a49b-f15da7c8c296
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
Location: /v1/accounts/qa-b5bdbef35e78
X-Served-Region: us
Content-Length: 181

{"id":"acc_a7fa29bf-a6f4-44f3-b17c-212c8cd90fbd","handle":"qa-b5bdbef35e78","displayName":"QA b5bdbef35e78","region":"us","role":"user","createdAt":"2026-11-21T09:57:10.776771908Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-07236edc-2986-4f44-abc6-2d9315f4570c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07236edc-2986-4f44-abc6-2d9315f4570c
Content-Type: application/json

--- request body ---
{"handle":"qa-4f9d86f15081","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-07236edc-2986-4f44-abc6-2d9315f4570c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_210892b5-5904-4657-a7fb-ceb17bbc5781"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-60c04813-c401-48eb-868f-2cae9cf5f0e1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0851081234654160a414c8fa9ed9a580
X-Correlation-Id: qa-60c04813-c401-48eb-868f-2cae9cf5f0e1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-60c04813-c401-48eb-868f-2cae9cf5f0e1
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
Location: /v1/credits/purchases/pur_0b975682-7453-411f-b935-83db5ed5ac0b
Content-Length: 144

{"id":"pur_0b975682-7453-411f-b935-83db5ed5ac0b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971743177Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d273ae68-7092-4451-954a-cd5066ba47d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d273ae68-7092-4451-954a-cd5066ba47d8
Content-Type: application/json

--- request body ---
{"handle":"qa-b5bdbef35e78","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d273ae68-7092-4451-954a-cd5066ba47d8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7fa29bf-a6f4-44f3-b17c-212c8cd90fbd"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bb14a62f-c063-49a4-b5d2-aa09ffec4f79

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0851081234654160a414c8fa9ed9a580
X-Correlation-Id: qa-bb14a62f-c063-49a4-b5d2-aa09ffec4f79
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb14a62f-c063-49a4-b5d2-aa09ffec4f79
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
Location: /v1/credits/purchases/pur_4e141f02-8251-4873-afaa-0edd1826be57
Content-Length: 144

{"id":"pur_4e141f02-8251-4873-afaa-0edd1826be57","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:11.079602079Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42ddf53c-dbbc-4403-a9e9-0b539082bc7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42ddf53c-dbbc-4403-a9e9-0b539082bc7a
Content-Type: application/json

--- response: 204 in 45 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42ddf53c-dbbc-4403-a9e9-0b539082bc7a
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
correlation: qa-2638372b-80e2-4de0-bdaa-290ed9cbec65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2638372b-80e2-4de0-bdaa-290ed9cbec65
Content-Type: application/json

--- request body ---
{"handle":"qa-b5bdbef35e78","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2638372b-80e2-4de0-bdaa-290ed9cbec65
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2638372b-80e2-4de0-bdaa-290ed9cbec65"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53d70526-d520-4c08-b8f8-0b30c6d9c042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d70526-d520-4c08-b8f8-0b30c6d9c042
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53d70526-d520-4c08-b8f8-0b30c6d9c042
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
correlation: qa-2e38adae-c02e-412d-8f58-e87f1313f4b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e38adae-c02e-412d-8f58-e87f1313f4b8
Content-Type: application/json

--- request body ---
{"handle":"qa-4f9d86f15081","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e38adae-c02e-412d-8f58-e87f1313f4b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e38adae-c02e-412d-8f58-e87f1313f4b8"}
```
