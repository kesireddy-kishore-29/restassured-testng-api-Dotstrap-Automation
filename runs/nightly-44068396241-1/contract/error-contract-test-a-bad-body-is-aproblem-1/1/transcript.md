# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-db7b6f0f-751e-4be0-9920-831ceae8ac5a` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-d0e572e2-444a-4175-ba8b-57f250967dca` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-c50e682a-7b32-4fc5-bc59-a40213a76312` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-a3497f50-d0e8-4bcb-8ea4-dad1db908bf5` |
| 5 | `POST /v1/auth/token` | 415 | 29 | `qa-fd8bd3f5-1d73-4056-a89b-5c12bd4f6cb4` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-6e2c749d-d191-4d10-b848-1ea656553889` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6ba64b6c-d506-4210-a573-d40e4f564b21` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-afdadb3c-1483-463b-94f5-9584b875425f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9de0e8c4-afd6-41f2-8c21-ef05b84a0e6e` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-7e67b113-a737-455a-b2f9-b24160ebb8f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-db7b6f0f-751e-4be0-9920-831ceae8ac5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db7b6f0f-751e-4be0-9920-831ceae8ac5a
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5d5d615f8a","displayName":"QA cb5d5d615f8a","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-db7b6f0f-751e-4be0-9920-831ceae8ac5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-cb5d5d615f8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b754826-47cf-4b73-b421-9503f65219c4","handle":"qa-cb5d5d615f8a","displayName":"QA cb5d5d615f8a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.615863435Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0e572e2-444a-4175-ba8b-57f250967dca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0e572e2-444a-4175-ba8b-57f250967dca
Content-Type: application/json

--- request body ---
{"handle":"qa-ba6b60297236","displayName":"QA ba6b60297236","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0e572e2-444a-4175-ba8b-57f250967dca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-ba6b60297236
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8c161c0-b528-42a7-bbfe-a1c260998a32","handle":"qa-ba6b60297236","displayName":"QA ba6b60297236","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.647578115Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c50e682a-7b32-4fc5-bc59-a40213a76312

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c50e682a-7b32-4fc5-bc59-a40213a76312
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5d5d615f8a","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c50e682a-7b32-4fc5-bc59-a40213a76312
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b754826-47cf-4b73-b421-9503f65219c4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a3497f50-d0e8-4bcb-8ea4-dad1db908bf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3497f50-d0e8-4bcb-8ea4-dad1db908bf5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ba6b60297236","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3497f50-d0e8-4bcb-8ea4-dad1db908bf5
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
Location: /v1/conversations/cnv_1c8a93da-3692-4ed3-b0ac-839d1570eba5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1c8a93da-3692-4ed3-b0ac-839d1570eba5","subject":"Error contract","status":"open","region":"eu","participants":["qa-cb5d5d615f8a","qa-ba6b60297236"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.717761015Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fd8bd3f5-1d73-4056-a89b-5c12bd4f6cb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd8bd3f5-1d73-4056-a89b-5c12bd4f6cb4
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 29 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd8bd3f5-1d73-4056-a89b-5c12bd4f6cb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-fd8bd3f5-1d73-4056-a89b-5c12bd4f6cb4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6e2c749d-d191-4d10-b848-1ea656553889

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e2c749d-d191-4d10-b848-1ea656553889
Content-Type: application/json

--- request body ---
{"handle":"qa-ba6b60297236","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e2c749d-d191-4d10-b848-1ea656553889
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8c161c0-b528-42a7-bbfe-a1c260998a32"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ba64b6c-d506-4210-a573-d40e4f564b21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba64b6c-d506-4210-a573-d40e4f564b21
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ba64b6c-d506-4210-a573-d40e4f564b21
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
correlation: qa-afdadb3c-1483-463b-94f5-9584b875425f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afdadb3c-1483-463b-94f5-9584b875425f
Content-Type: application/json

--- request body ---
{"handle":"qa-ba6b60297236","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afdadb3c-1483-463b-94f5-9584b875425f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afdadb3c-1483-463b-94f5-9584b875425f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9de0e8c4-afd6-41f2-8c21-ef05b84a0e6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9de0e8c4-afd6-41f2-8c21-ef05b84a0e6e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9de0e8c4-afd6-41f2-8c21-ef05b84a0e6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7e67b113-a737-455a-b2f9-b24160ebb8f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e67b113-a737-455a-b2f9-b24160ebb8f3
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5d5d615f8a","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e67b113-a737-455a-b2f9-b24160ebb8f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e67b113-a737-455a-b2f9-b24160ebb8f3"}
```
