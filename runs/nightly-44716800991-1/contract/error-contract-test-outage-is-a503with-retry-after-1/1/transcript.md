# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-827a5285-27d1-4942-b09a-c0ad74217350` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-95ec2c0f-bb62-4bc3-b4ef-71870d568402` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-6db8fcaf-48a8-4fc6-a01f-fc04fc7a4a00` |
| 4 | `POST /v1/conversations` | 201 | 34 | `qa-0c44d3ca-5f03-4b43-8729-ea294c4aa5f1` |
| 5 | `POST /v1/accounts` | 503 | 23 | `qa-06bf9cac-1394-4ebe-b50b-381cd781b342` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-c0659404-b6ad-4ff5-90c8-177123056224` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-b41f8c44-57e0-41b4-a27d-5f2c2c6d43a5` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-8c2c09bc-007f-41c6-ad6a-fe1b60610831` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-b61fefc0-07f8-4f13-beaa-10c2a582ea8a` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-95d9f27f-63c4-4fbf-b4d4-a23cc4efe3c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-827a5285-27d1-4942-b09a-c0ad74217350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-827a5285-27d1-4942-b09a-c0ad74217350
Content-Type: application/json

--- request body ---
{"handle":"qa-76f8c9e81e17","displayName":"QA 76f8c9e81e17","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-827a5285-27d1-4942-b09a-c0ad74217350
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
Location: /v1/accounts/qa-76f8c9e81e17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d61b47c-5a44-42a8-b383-009d7b56190d","handle":"qa-76f8c9e81e17","displayName":"QA 76f8c9e81e17","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.406865770Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-95ec2c0f-bb62-4bc3-b4ef-71870d568402

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95ec2c0f-bb62-4bc3-b4ef-71870d568402
Content-Type: application/json

--- request body ---
{"handle":"qa-934d9dacf3c2","displayName":"QA 934d9dacf3c2","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-95ec2c0f-bb62-4bc3-b4ef-71870d568402
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-934d9dacf3c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_200b3784-9e5d-4509-a488-eee4ca648c55","handle":"qa-934d9dacf3c2","displayName":"QA 934d9dacf3c2","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.463142739Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6db8fcaf-48a8-4fc6-a01f-fc04fc7a4a00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6db8fcaf-48a8-4fc6-a01f-fc04fc7a4a00
Content-Type: application/json

--- request body ---
{"handle":"qa-76f8c9e81e17","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6db8fcaf-48a8-4fc6-a01f-fc04fc7a4a00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d61b47c-5a44-42a8-b383-009d7b56190d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0c44d3ca-5f03-4b43-8729-ea294c4aa5f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c44d3ca-5f03-4b43-8729-ea294c4aa5f1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-934d9dacf3c2","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c44d3ca-5f03-4b43-8729-ea294c4aa5f1
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
Location: /v1/conversations/cnv_0f4c7249-6df8-48bd-9419-43fc00a59030
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0f4c7249-6df8-48bd-9419-43fc00a59030","subject":"Error contract","status":"open","region":"eu","participants":["qa-76f8c9e81e17","qa-934d9dacf3c2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.609341554Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-06bf9cac-1394-4ebe-b50b-381cd781b342

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e6b8d184-b641-4d73-93ea-dc9d9010126c
X-Correlation-Id: qa-06bf9cac-1394-4ebe-b50b-381cd781b342
Content-Type: application/json

--- request body ---
{"handle":"qa-8fc9c7525b0f","displayName":"QA 8fc9c7525b0f","password":"****","region":"eu"}

--- response: 503 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06bf9cac-1394-4ebe-b50b-381cd781b342
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-06bf9cac-1394-4ebe-b50b-381cd781b342"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c0659404-b6ad-4ff5-90c8-177123056224

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0659404-b6ad-4ff5-90c8-177123056224
Content-Type: application/json

--- request body ---
{"handle":"qa-934d9dacf3c2","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0659404-b6ad-4ff5-90c8-177123056224
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_200b3784-9e5d-4509-a488-eee4ca648c55"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b41f8c44-57e0-41b4-a27d-5f2c2c6d43a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b41f8c44-57e0-41b4-a27d-5f2c2c6d43a5
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b41f8c44-57e0-41b4-a27d-5f2c2c6d43a5
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
correlation: qa-8c2c09bc-007f-41c6-ad6a-fe1b60610831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2c09bc-007f-41c6-ad6a-fe1b60610831
Content-Type: application/json

--- request body ---
{"handle":"qa-934d9dacf3c2","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c2c09bc-007f-41c6-ad6a-fe1b60610831
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c2c09bc-007f-41c6-ad6a-fe1b60610831"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b61fefc0-07f8-4f13-beaa-10c2a582ea8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b61fefc0-07f8-4f13-beaa-10c2a582ea8a
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b61fefc0-07f8-4f13-beaa-10c2a582ea8a
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
correlation: qa-95d9f27f-63c4-4fbf-b4d4-a23cc4efe3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d9f27f-63c4-4fbf-b4d4-a23cc4efe3c0
Content-Type: application/json

--- request body ---
{"handle":"qa-76f8c9e81e17","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95d9f27f-63c4-4fbf-b4d4-a23cc4efe3c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95d9f27f-63c4-4fbf-b4d4-a23cc4efe3c0"}
```
