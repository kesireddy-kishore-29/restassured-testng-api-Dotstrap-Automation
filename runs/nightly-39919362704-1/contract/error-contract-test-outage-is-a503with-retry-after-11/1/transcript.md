# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-a1642f41-f17b-4b8c-8a13-b51b0e710e77` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-de8df3ab-fd09-44eb-a2ca-75ec4196051c` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-e20d5aad-2f3b-454e-b4b6-eb4e9b1d6f27` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-46efd0c9-d892-4aac-ae2d-47a413d8c841` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 14 | `qa-025870ba-772b-4925-8688-8a33ff473330` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-da109f7d-954e-453e-92b5-0aae635abc25` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2d723979-5590-4659-ae99-e7fb7b22c484` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-79c57bc4-f60a-4b0d-b7e5-9ffa37388351` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d20fc136-d177-459d-8999-4e6bf1ccc7bf` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-57a2092c-516c-4f27-844e-c9298429d4ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a1642f41-f17b-4b8c-8a13-b51b0e710e77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1642f41-f17b-4b8c-8a13-b51b0e710e77
Content-Type: application/json

--- request body ---
{"handle":"qa-afe6dab8cd16","displayName":"QA afe6dab8cd16","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1642f41-f17b-4b8c-8a13-b51b0e710e77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-afe6dab8cd16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_40b8db5e-98b5-4072-96eb-a808c63c44b5","handle":"qa-afe6dab8cd16","displayName":"QA afe6dab8cd16","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.191928857Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-de8df3ab-fd09-44eb-a2ca-75ec4196051c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de8df3ab-fd09-44eb-a2ca-75ec4196051c
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac65206e5bd","displayName":"QA 9ac65206e5bd","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-de8df3ab-fd09-44eb-a2ca-75ec4196051c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Location: /v1/accounts/qa-9ac65206e5bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb9ab6a2-2d78-48b0-8799-60ed1904a403","handle":"qa-9ac65206e5bd","displayName":"QA 9ac65206e5bd","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.270878291Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e20d5aad-2f3b-454e-b4b6-eb4e9b1d6f27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e20d5aad-2f3b-454e-b4b6-eb4e9b1d6f27
Content-Type: application/json

--- request body ---
{"handle":"qa-afe6dab8cd16","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e20d5aad-2f3b-454e-b4b6-eb4e9b1d6f27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_40b8db5e-98b5-4072-96eb-a808c63c44b5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-46efd0c9-d892-4aac-ae2d-47a413d8c841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46efd0c9-d892-4aac-ae2d-47a413d8c841
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9ac65206e5bd","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-46efd0c9-d892-4aac-ae2d-47a413d8c841
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
Location: /v1/conversations/cnv_d492b359-35f9-467d-975f-8f3a51f21b3d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d492b359-35f9-467d-975f-8f3a51f21b3d","subject":"Error contract","status":"open","region":"eu","participants":["qa-afe6dab8cd16","qa-9ac65206e5bd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.381481944Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d492b359-35f9-467d-975f-8f3a51f21b3d/read
correlation: qa-025870ba-772b-4925-8688-8a33ff473330

--- request headers ---
Accept: application/json
X-Fault-Key: 26c3cc8b-566c-4425-993f-0fd6459d0795
X-Fault: unavailable-once
X-Correlation-Id: qa-025870ba-772b-4925-8688-8a33ff473330
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-025870ba-772b-4925-8688-8a33ff473330
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d492b359-35f9-467d-975f-8f3a51f21b3d/read","correlationId":"qa-025870ba-772b-4925-8688-8a33ff473330"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da109f7d-954e-453e-92b5-0aae635abc25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da109f7d-954e-453e-92b5-0aae635abc25
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac65206e5bd","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-da109f7d-954e-453e-92b5-0aae635abc25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb9ab6a2-2d78-48b0-8799-60ed1904a403"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d723979-5590-4659-ae99-e7fb7b22c484

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d723979-5590-4659-ae99-e7fb7b22c484
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d723979-5590-4659-ae99-e7fb7b22c484
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-79c57bc4-f60a-4b0d-b7e5-9ffa37388351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79c57bc4-f60a-4b0d-b7e5-9ffa37388351
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac65206e5bd","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79c57bc4-f60a-4b0d-b7e5-9ffa37388351
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79c57bc4-f60a-4b0d-b7e5-9ffa37388351"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d20fc136-d177-459d-8999-4e6bf1ccc7bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d20fc136-d177-459d-8999-4e6bf1ccc7bf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d20fc136-d177-459d-8999-4e6bf1ccc7bf
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
correlation: qa-57a2092c-516c-4f27-844e-c9298429d4ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a2092c-516c-4f27-844e-c9298429d4ca
Content-Type: application/json

--- request body ---
{"handle":"qa-afe6dab8cd16","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57a2092c-516c-4f27-844e-c9298429d4ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57a2092c-516c-4f27-844e-c9298429d4ca"}
```
