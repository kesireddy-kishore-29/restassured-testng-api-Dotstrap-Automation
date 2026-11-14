# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-d1881b4d-1bf6-498b-94fd-a9dddfe530fe` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-4267d575-447a-44dd-97c7-4457e375f88b` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-2a950305-4de0-4c1a-aff3-60948c07f2f9` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-3c35864b-9288-49a9-a96f-0d12e82a78b8` |
| 5 | `DELETE /v1/accounts/me` | 503 | 14 | `qa-46b13531-63f1-4901-8f69-07f5fd8432dd` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-2c75fdc5-50f4-4b51-8fbc-983b1a880921` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b60eed14-cae1-4ffc-aeb2-9a7504e88231` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-355521e4-b8f0-459f-895c-77c060a71bb9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-46973097-8fc0-4aa3-b8d5-890e124c57cf` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-6e4a37c0-9205-4f21-98ff-229c126266d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d1881b4d-1bf6-498b-94fd-a9dddfe530fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1881b4d-1bf6-498b-94fd-a9dddfe530fe
Content-Type: application/json

--- request body ---
{"handle":"qa-3a1656ded762","displayName":"QA 3a1656ded762","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1881b4d-1bf6-498b-94fd-a9dddfe530fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-3a1656ded762
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2724bac6-93f4-43d7-981c-e9f93b05db3d","handle":"qa-3a1656ded762","displayName":"QA 3a1656ded762","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.388329556Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4267d575-447a-44dd-97c7-4457e375f88b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4267d575-447a-44dd-97c7-4457e375f88b
Content-Type: application/json

--- request body ---
{"handle":"qa-1c689289788b","displayName":"QA 1c689289788b","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4267d575-447a-44dd-97c7-4457e375f88b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-1c689289788b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3aaf10ee-3b08-418e-bff2-1640e6d46f2a","handle":"qa-1c689289788b","displayName":"QA 1c689289788b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.436831101Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2a950305-4de0-4c1a-aff3-60948c07f2f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a950305-4de0-4c1a-aff3-60948c07f2f9
Content-Type: application/json

--- request body ---
{"handle":"qa-3a1656ded762","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a950305-4de0-4c1a-aff3-60948c07f2f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2724bac6-93f4-43d7-981c-e9f93b05db3d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3c35864b-9288-49a9-a96f-0d12e82a78b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c35864b-9288-49a9-a96f-0d12e82a78b8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c689289788b","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c35864b-9288-49a9-a96f-0d12e82a78b8
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
Location: /v1/conversations/cnv_8dfc3152-346d-4471-a9ae-0d9df8f332ee
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8dfc3152-346d-4471-a9ae-0d9df8f332ee","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a1656ded762","qa-1c689289788b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.517276278Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46b13531-63f1-4901-8f69-07f5fd8432dd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8ff5d3f3-2c87-4675-ba4e-98394dd48bbf
X-Correlation-Id: qa-46b13531-63f1-4901-8f69-07f5fd8432dd
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46b13531-63f1-4901-8f69-07f5fd8432dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-46b13531-63f1-4901-8f69-07f5fd8432dd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2c75fdc5-50f4-4b51-8fbc-983b1a880921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c75fdc5-50f4-4b51-8fbc-983b1a880921
Content-Type: application/json

--- request body ---
{"handle":"qa-1c689289788b","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c75fdc5-50f4-4b51-8fbc-983b1a880921
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3aaf10ee-3b08-418e-bff2-1640e6d46f2a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b60eed14-cae1-4ffc-aeb2-9a7504e88231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b60eed14-cae1-4ffc-aeb2-9a7504e88231
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b60eed14-cae1-4ffc-aeb2-9a7504e88231
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
correlation: qa-355521e4-b8f0-459f-895c-77c060a71bb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-355521e4-b8f0-459f-895c-77c060a71bb9
Content-Type: application/json

--- request body ---
{"handle":"qa-1c689289788b","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-355521e4-b8f0-459f-895c-77c060a71bb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-355521e4-b8f0-459f-895c-77c060a71bb9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46973097-8fc0-4aa3-b8d5-890e124c57cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46973097-8fc0-4aa3-b8d5-890e124c57cf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46973097-8fc0-4aa3-b8d5-890e124c57cf
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
correlation: qa-6e4a37c0-9205-4f21-98ff-229c126266d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4a37c0-9205-4f21-98ff-229c126266d6
Content-Type: application/json

--- request body ---
{"handle":"qa-3a1656ded762","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e4a37c0-9205-4f21-98ff-229c126266d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e4a37c0-9205-4f21-98ff-229c126266d6"}
```
