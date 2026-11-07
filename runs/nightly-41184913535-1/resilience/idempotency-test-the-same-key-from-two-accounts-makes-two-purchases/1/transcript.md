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
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-e64d6b88-766e-4022-9434-66f41794da7d` |
| 2 | `POST /v1/accounts` | 201 | 5 | `qa-e8df2ce9-e683-4aef-904a-6b29477e1ef1` |
| 3 | `POST /v1/auth/token` | 200 | 6 | `qa-1fd4e14f-4f33-49a5-9183-b88b8ecad0b6` |
| 4 | `POST /v1/credits/purchases` | 201 | 6 | `qa-b41c6288-ebc9-4ba0-bb11-ca76ccd67474` |
| 5 | `POST /v1/auth/token` | 200 | 5 | `qa-046b674c-8a71-4a71-ab1f-8f20d884948d` |
| 6 | `POST /v1/credits/purchases` | 201 | 3 | `qa-1f83e393-c382-462b-973f-6cedebcd973d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-317139ae-0f21-4fac-95bd-56c949eaa9d4` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-3be7b45e-3fe0-4aba-b50b-c911cfb67744` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-a6c76fb0-efda-4950-90a1-8fe2cbcd6581` |
| 10 | `POST /v1/auth/token` | 401 | 2 | `qa-f15ed517-a69a-4851-974c-8351fd558c7d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e64d6b88-766e-4022-9434-66f41794da7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e64d6b88-766e-4022-9434-66f41794da7d
Content-Type: application/json

--- request body ---
{"handle":"qa-ccabf0a0838b","displayName":"QA ccabf0a0838b","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e64d6b88-766e-4022-9434-66f41794da7d
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
Location: /v1/accounts/qa-ccabf0a0838b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_659496c3-fe76-4d4e-bd8f-882c6125c0fa","handle":"qa-ccabf0a0838b","displayName":"QA ccabf0a0838b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:30.732883717Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e8df2ce9-e683-4aef-904a-6b29477e1ef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8df2ce9-e683-4aef-904a-6b29477e1ef1
Content-Type: application/json

--- request body ---
{"handle":"qa-893d3219b02f","displayName":"QA 893d3219b02f","password":"****","region":"us"}

--- response: 201 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8df2ce9-e683-4aef-904a-6b29477e1ef1
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
Location: /v1/accounts/qa-893d3219b02f
X-Served-Region: us
Content-Length: 181

{"id":"acc_bbe0e63a-5f0d-4bd6-b176-99b8f9d9da9d","handle":"qa-893d3219b02f","displayName":"QA 893d3219b02f","region":"us","role":"user","createdAt":"2026-10-31T08:31:30.741869772Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1fd4e14f-4f33-49a5-9183-b88b8ecad0b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fd4e14f-4f33-49a5-9183-b88b8ecad0b6
Content-Type: application/json

--- request body ---
{"handle":"qa-ccabf0a0838b","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fd4e14f-4f33-49a5-9183-b88b8ecad0b6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_659496c3-fe76-4d4e-bd8f-882c6125c0fa"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b41c6288-ebc9-4ba0-bb11-ca76ccd67474

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8c1ba2c7fb6641259bc125591a1ba153
X-Correlation-Id: qa-b41c6288-ebc9-4ba0-bb11-ca76ccd67474
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b41c6288-ebc9-4ba0-bb11-ca76ccd67474
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
Location: /v1/credits/purchases/pur_1646e44a-804f-407b-a684-c668f5b7e4f2
Content-Length: 144

{"id":"pur_1646e44a-804f-407b-a684-c668f5b7e4f2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:30.762343753Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-046b674c-8a71-4a71-ab1f-8f20d884948d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-046b674c-8a71-4a71-ab1f-8f20d884948d
Content-Type: application/json

--- request body ---
{"handle":"qa-893d3219b02f","password":"****"}

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-046b674c-8a71-4a71-ab1f-8f20d884948d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bbe0e63a-5f0d-4bd6-b176-99b8f9d9da9d"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1f83e393-c382-462b-973f-6cedebcd973d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8c1ba2c7fb6641259bc125591a1ba153
X-Correlation-Id: qa-1f83e393-c382-462b-973f-6cedebcd973d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f83e393-c382-462b-973f-6cedebcd973d
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
Location: /v1/credits/purchases/pur_86c11ede-5010-4b4d-8449-3c159751f573
Content-Length: 144

{"id":"pur_86c11ede-5010-4b4d-8449-3c159751f573","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:30.778250110Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-317139ae-0f21-4fac-95bd-56c949eaa9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317139ae-0f21-4fac-95bd-56c949eaa9d4
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-317139ae-0f21-4fac-95bd-56c949eaa9d4
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
correlation: qa-3be7b45e-3fe0-4aba-b50b-c911cfb67744

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3be7b45e-3fe0-4aba-b50b-c911cfb67744
Content-Type: application/json

--- request body ---
{"handle":"qa-893d3219b02f","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3be7b45e-3fe0-4aba-b50b-c911cfb67744
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3be7b45e-3fe0-4aba-b50b-c911cfb67744"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6c76fb0-efda-4950-90a1-8fe2cbcd6581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c76fb0-efda-4950-90a1-8fe2cbcd6581
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6c76fb0-efda-4950-90a1-8fe2cbcd6581
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
correlation: qa-f15ed517-a69a-4851-974c-8351fd558c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f15ed517-a69a-4851-974c-8351fd558c7d
Content-Type: application/json

--- request body ---
{"handle":"qa-ccabf0a0838b","password":"****"}

--- response: 401 in 2 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f15ed517-a69a-4851-974c-8351fd558c7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f15ed517-a69a-4851-974c-8351fd558c7d"}
```
