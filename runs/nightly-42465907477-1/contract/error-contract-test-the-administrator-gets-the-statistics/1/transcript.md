# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-83717c04-bbd3-47fe-a290-f1b49d751773` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-bfeff3fb-1b7d-441c-b5fd-cc6bfae286b1` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-722e055b-570e-4e15-bff7-cec17517df49` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-09e9a3e4-8f81-431a-bed0-652cad4be8fe` |
| 5 | `POST /v1/auth/token` | 200 | 15 | `qa-5b6bdecd-c3c2-42a2-9f99-fb73eb74a06b` |
| 6 | `GET /v1/admin/stats` | 200 | 6 | `qa-ab4b3b0c-de1e-4d93-8ddc-840125dcf216` |
| 7 | `POST /v1/auth/token` | 200 | 8 | `qa-ae202ad4-94d0-42fd-ac6a-4e3671aa5fee` |
| 8 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-3b8dfcd3-78a3-44dd-9c53-217841201315` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-93288d28-1249-482c-94c2-b84573956709` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-2b9f0556-25d6-4366-b2e7-21046fd4b908` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-572372f3-13b0-4a6c-aee4-04ddc623a9fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-83717c04-bbd3-47fe-a290-f1b49d751773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83717c04-bbd3-47fe-a290-f1b49d751773
Content-Type: application/json

--- request body ---
{"handle":"qa-85c81b911bbc","displayName":"QA 85c81b911bbc","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-83717c04-bbd3-47fe-a290-f1b49d751773
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 8
Location: /v1/accounts/qa-85c81b911bbc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e12a55e-9835-42fa-9a81-edd5cc593b07","handle":"qa-85c81b911bbc","displayName":"QA 85c81b911bbc","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.734015339Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bfeff3fb-1b7d-441c-b5fd-cc6bfae286b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfeff3fb-1b7d-441c-b5fd-cc6bfae286b1
Content-Type: application/json

--- request body ---
{"handle":"qa-c4cfcba49543","displayName":"QA c4cfcba49543","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfeff3fb-1b7d-441c-b5fd-cc6bfae286b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 8
Location: /v1/accounts/qa-c4cfcba49543
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a52af0f-33bf-4e5b-8121-3c455144d646","handle":"qa-c4cfcba49543","displayName":"QA c4cfcba49543","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.755767190Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-722e055b-570e-4e15-bff7-cec17517df49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722e055b-570e-4e15-bff7-cec17517df49
Content-Type: application/json

--- request body ---
{"handle":"qa-85c81b911bbc","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-722e055b-570e-4e15-bff7-cec17517df49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e12a55e-9835-42fa-9a81-edd5cc593b07"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-09e9a3e4-8f81-431a-bed0-652cad4be8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e9a3e4-8f81-431a-bed0-652cad4be8fe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c4cfcba49543","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-09e9a3e4-8f81-431a-bed0-652cad4be8fe
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
Location: /v1/conversations/cnv_ca926334-55c3-4ba3-8cb2-bc59653768f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ca926334-55c3-4ba3-8cb2-bc59653768f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-85c81b911bbc","qa-c4cfcba49543"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.784080658Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5b6bdecd-c3c2-42a2-9f99-fb73eb74a06b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6bdecd-c3c2-42a2-9f99-fb73eb74a06b
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b6bdecd-c3c2-42a2-9f99-fb73eb74a06b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a75f21a2-5a4c-48d3-ac3f-a184292f18c1"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-ab4b3b0c-de1e-4d93-8ddc-840125dcf216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab4b3b0c-de1e-4d93-8ddc-840125dcf216
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab4b3b0c-de1e-4d93-8ddc-840125dcf216
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
Content-Length: 46

{"accounts":9,"conversations":4,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ae202ad4-94d0-42fd-ac6a-4e3671aa5fee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae202ad4-94d0-42fd-ac6a-4e3671aa5fee
Content-Type: application/json

--- request body ---
{"handle":"qa-c4cfcba49543","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae202ad4-94d0-42fd-ac6a-4e3671aa5fee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a52af0f-33bf-4e5b-8121-3c455144d646"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b8dfcd3-78a3-44dd-9c53-217841201315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b8dfcd3-78a3-44dd-9c53-217841201315
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b8dfcd3-78a3-44dd-9c53-217841201315
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-93288d28-1249-482c-94c2-b84573956709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93288d28-1249-482c-94c2-b84573956709
Content-Type: application/json

--- request body ---
{"handle":"qa-c4cfcba49543","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93288d28-1249-482c-94c2-b84573956709
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93288d28-1249-482c-94c2-b84573956709"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b9f0556-25d6-4366-b2e7-21046fd4b908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b9f0556-25d6-4366-b2e7-21046fd4b908
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b9f0556-25d6-4366-b2e7-21046fd4b908
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-572372f3-13b0-4a6c-aee4-04ddc623a9fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-572372f3-13b0-4a6c-aee4-04ddc623a9fb
Content-Type: application/json

--- request body ---
{"handle":"qa-85c81b911bbc","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-572372f3-13b0-4a6c-aee4-04ddc623a9fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-572372f3-13b0-4a6c-aee4-04ddc623a9fb"}
```
