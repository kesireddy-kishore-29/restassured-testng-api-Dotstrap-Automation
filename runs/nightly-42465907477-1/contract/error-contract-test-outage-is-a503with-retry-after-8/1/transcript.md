# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-86a53d4e-f5d4-4317-87aa-9d847a369c13` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-23bd1c59-4c70-46a0-9a37-b39961d6c499` |
| 3 | `POST /v1/auth/token` | 200 | 6 | `qa-5330b98a-3eb9-48ab-b652-36770758bac4` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-5316b5ee-ff50-4b17-9bc9-7ed92e463c0f` |
| 5 | `GET /v1/conversations/{id}` | 503 | 16 | `qa-10d93eae-49eb-40d2-8f39-b69a26f233d1` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-695cba0e-14f9-449e-a5b7-a69462c3a25d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d7290f66-c443-4dee-856e-1ab92ba89a83` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-5df342d3-d3ee-408a-81b8-c0eb0caeebd5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0f1617d9-b113-4fb5-931e-ea104f146d56` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-d0b453d8-4740-4097-832e-b0909eb945bc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86a53d4e-f5d4-4317-87aa-9d847a369c13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a53d4e-f5d4-4317-87aa-9d847a369c13
Content-Type: application/json

--- request body ---
{"handle":"qa-26d678abd7d9","displayName":"QA 26d678abd7d9","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-86a53d4e-f5d4-4317-87aa-9d847a369c13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 9
Location: /v1/accounts/qa-26d678abd7d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ca193a7-6d48-486c-ad2c-48af4b3c9c61","handle":"qa-26d678abd7d9","displayName":"QA 26d678abd7d9","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.941223657Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-23bd1c59-4c70-46a0-9a37-b39961d6c499

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23bd1c59-4c70-46a0-9a37-b39961d6c499
Content-Type: application/json

--- request body ---
{"handle":"qa-083e5971b8ee","displayName":"QA 083e5971b8ee","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-23bd1c59-4c70-46a0-9a37-b39961d6c499
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Location: /v1/accounts/qa-083e5971b8ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6356e20c-0846-4dfd-96c3-e10fa21ed879","handle":"qa-083e5971b8ee","displayName":"QA 083e5971b8ee","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.956530690Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5330b98a-3eb9-48ab-b652-36770758bac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5330b98a-3eb9-48ab-b652-36770758bac4
Content-Type: application/json

--- request body ---
{"handle":"qa-26d678abd7d9","password":"****"}

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5330b98a-3eb9-48ab-b652-36770758bac4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ca193a7-6d48-486c-ad2c-48af4b3c9c61"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5316b5ee-ff50-4b17-9bc9-7ed92e463c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5316b5ee-ff50-4b17-9bc9-7ed92e463c0f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-083e5971b8ee","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5316b5ee-ff50-4b17-9bc9-7ed92e463c0f
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
Location: /v1/conversations/cnv_148c0370-7b59-43ca-8b5e-ae3cb40e82f4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_148c0370-7b59-43ca-8b5e-ae3cb40e82f4","subject":"Error contract","status":"open","region":"eu","participants":["qa-26d678abd7d9","qa-083e5971b8ee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.998538938Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_148c0370-7b59-43ca-8b5e-ae3cb40e82f4
correlation: qa-10d93eae-49eb-40d2-8f39-b69a26f233d1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c9f43cdf-ee9d-4d4b-a54f-6ee64bffa51d
X-Correlation-Id: qa-10d93eae-49eb-40d2-8f39-b69a26f233d1
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10d93eae-49eb-40d2-8f39-b69a26f233d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_148c0370-7b59-43ca-8b5e-ae3cb40e82f4","correlationId":"qa-10d93eae-49eb-40d2-8f39-b69a26f233d1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-695cba0e-14f9-449e-a5b7-a69462c3a25d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-695cba0e-14f9-449e-a5b7-a69462c3a25d
Content-Type: application/json

--- request body ---
{"handle":"qa-083e5971b8ee","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-695cba0e-14f9-449e-a5b7-a69462c3a25d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6356e20c-0846-4dfd-96c3-e10fa21ed879"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7290f66-c443-4dee-856e-1ab92ba89a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7290f66-c443-4dee-856e-1ab92ba89a83
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7290f66-c443-4dee-856e-1ab92ba89a83
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
correlation: qa-5df342d3-d3ee-408a-81b8-c0eb0caeebd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5df342d3-d3ee-408a-81b8-c0eb0caeebd5
Content-Type: application/json

--- request body ---
{"handle":"qa-083e5971b8ee","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5df342d3-d3ee-408a-81b8-c0eb0caeebd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5df342d3-d3ee-408a-81b8-c0eb0caeebd5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f1617d9-b113-4fb5-931e-ea104f146d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f1617d9-b113-4fb5-931e-ea104f146d56
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f1617d9-b113-4fb5-931e-ea104f146d56
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
correlation: qa-d0b453d8-4740-4097-832e-b0909eb945bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0b453d8-4740-4097-832e-b0909eb945bc
Content-Type: application/json

--- request body ---
{"handle":"qa-26d678abd7d9","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0b453d8-4740-4097-832e-b0909eb945bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0b453d8-4740-4097-832e-b0909eb945bc"}
```
