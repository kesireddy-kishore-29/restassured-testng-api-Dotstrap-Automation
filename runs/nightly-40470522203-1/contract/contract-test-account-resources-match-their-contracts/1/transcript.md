# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 425 | `qa-52bf8569-78eb-4bc6-a145-960f85253c6c` |
| 2 | `POST /v1/accounts` | 201 | 78 | `qa-5820ba9a-9236-4d5a-af13-e711702b0b77` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-942e042b-ceea-4382-977e-425171015533` |
| 4 | `POST /v1/auth/token` | 200 | 38 | `qa-d1097d53-5a06-4e05-9f58-2bc52fda2574` |
| 5 | `GET /v1/accounts/me` | 200 | 27 | `qa-630f2857-08c1-4d26-a513-fbbbd154a810` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 46 | `qa-d9bd158d-9079-41bf-b858-f17e1d1ddfc7` |
| 7 | `POST /v1/auth/token` | 200 | 22 | `qa-375825a3-7e31-4239-a3fd-1bb1faae2b64` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a3dc1504-58d7-455c-9742-3e62d27423ec` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-afaea1cd-f4e7-43d5-b128-293db170526a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-fa6f952a-a4f2-4cb1-9696-98293eae27a8` |
| 11 | `POST /v1/auth/token` | 401 | 20 | `qa-77f4345e-d683-4b1b-a780-2c6d5163b67c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-52bf8569-78eb-4bc6-a145-960f85253c6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52bf8569-78eb-4bc6-a145-960f85253c6c
Content-Type: application/json

--- request body ---
{"handle":"qa-3ce1b94a63e6","displayName":"QA 3ce1b94a63e6","password":"****","region":"eu"}

--- response: 201 in 425 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-52bf8569-78eb-4bc6-a145-960f85253c6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-3ce1b94a63e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf8c8905-6ca1-409a-8700-3e60510851e2","handle":"qa-3ce1b94a63e6","displayName":"QA 3ce1b94a63e6","region":"eu","role":"user","createdAt":"2026-10-27T08:00:25.915438112Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5820ba9a-9236-4d5a-af13-e711702b0b77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5820ba9a-9236-4d5a-af13-e711702b0b77
Content-Type: application/json

--- request body ---
{"handle":"qa-f96791b3c021","displayName":"QA f96791b3c021","password":"****","region":"us"}

--- response: 201 in 78 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5820ba9a-9236-4d5a-af13-e711702b0b77
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
Location: /v1/accounts/qa-f96791b3c021
X-Served-Region: us
Content-Length: 181

{"id":"acc_fd0c03dc-081e-44a4-843e-2df490de9261","handle":"qa-f96791b3c021","displayName":"QA f96791b3c021","region":"us","role":"user","createdAt":"2026-10-27T08:00:26.401352075Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-942e042b-ceea-4382-977e-425171015533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-942e042b-ceea-4382-977e-425171015533
Content-Type: application/json

--- request body ---
{"handle":"qa-3ce1b94a63e6","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-942e042b-ceea-4382-977e-425171015533
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf8c8905-6ca1-409a-8700-3e60510851e2"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d1097d53-5a06-4e05-9f58-2bc52fda2574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1097d53-5a06-4e05-9f58-2bc52fda2574
Content-Type: application/json

--- request body ---
{"handle":"qa-3ce1b94a63e6","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1097d53-5a06-4e05-9f58-2bc52fda2574
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf8c8905-6ca1-409a-8700-3e60510851e2"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-630f2857-08c1-4d26-a513-fbbbd154a810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630f2857-08c1-4d26-a513-fbbbd154a810
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-630f2857-08c1-4d26-a513-fbbbd154a810
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
Content-Length: 181

{"id":"acc_cf8c8905-6ca1-409a-8700-3e60510851e2","handle":"qa-3ce1b94a63e6","displayName":"QA 3ce1b94a63e6","region":"eu","role":"user","createdAt":"2026-10-27T08:00:25.915438112Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-f96791b3c021
correlation: qa-d9bd158d-9079-41bf-b858-f17e1d1ddfc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9bd158d-9079-41bf-b858-f17e1d1ddfc7
Content-Type: application/json

--- response: 200 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9bd158d-9079-41bf-b858-f17e1d1ddfc7
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
Content-Length: 74

{"handle":"qa-f96791b3c021","displayName":"QA f96791b3c021","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-375825a3-7e31-4239-a3fd-1bb1faae2b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-375825a3-7e31-4239-a3fd-1bb1faae2b64
Content-Type: application/json

--- request body ---
{"handle":"qa-f96791b3c021","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-375825a3-7e31-4239-a3fd-1bb1faae2b64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd0c03dc-081e-44a4-843e-2df490de9261"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3dc1504-58d7-455c-9742-3e62d27423ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3dc1504-58d7-455c-9742-3e62d27423ec
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3dc1504-58d7-455c-9742-3e62d27423ec
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-afaea1cd-f4e7-43d5-b128-293db170526a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afaea1cd-f4e7-43d5-b128-293db170526a
Content-Type: application/json

--- request body ---
{"handle":"qa-f96791b3c021","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afaea1cd-f4e7-43d5-b128-293db170526a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afaea1cd-f4e7-43d5-b128-293db170526a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa6f952a-a4f2-4cb1-9696-98293eae27a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6f952a-a4f2-4cb1-9696-98293eae27a8
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa6f952a-a4f2-4cb1-9696-98293eae27a8
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-77f4345e-d683-4b1b-a780-2c6d5163b67c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77f4345e-d683-4b1b-a780-2c6d5163b67c
Content-Type: application/json

--- request body ---
{"handle":"qa-3ce1b94a63e6","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77f4345e-d683-4b1b-a780-2c6d5163b67c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77f4345e-d683-4b1b-a780-2c6d5163b67c"}
```
