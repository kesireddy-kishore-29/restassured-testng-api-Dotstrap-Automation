# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-9e0b8968-a666-4b9d-84cb-6673d21d6043` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-7a2675e5-e44a-4759-8a05-db1e2b643770` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-1edc837d-9416-4681-a20c-eeae8b2fd770` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-8f4a2122-dcd5-4e91-8ccc-ce89cbf24b8f` |
| 5 | `PATCH /v1/accounts/me` | 415 | 14 | `qa-32f02891-a694-4812-8b3a-9159094b0c13` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-97d14ebb-09a4-4d0c-afeb-ff45351769c6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6ef3dace-e8f6-4899-bb4c-fb87872d21a6` |
| 8 | `POST /v1/auth/token` | 401 | 47 | `qa-29823a91-16ae-4e34-b16b-5182fb06f675` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-bf1e9555-a2bd-48c3-9d4a-8c2ef014a48d` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-bab2e868-ed0b-4f8a-a953-83919f0f3476` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e0b8968-a666-4b9d-84cb-6673d21d6043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0b8968-a666-4b9d-84cb-6673d21d6043
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca4618e96f2","displayName":"QA 5ca4618e96f2","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e0b8968-a666-4b9d-84cb-6673d21d6043
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-5ca4618e96f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd2b0d46-13ea-4686-a80f-2506edc4bb8b","handle":"qa-5ca4618e96f2","displayName":"QA 5ca4618e96f2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.445030939Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7a2675e5-e44a-4759-8a05-db1e2b643770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a2675e5-e44a-4759-8a05-db1e2b643770
Content-Type: application/json

--- request body ---
{"handle":"qa-881f9f34af55","displayName":"QA 881f9f34af55","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a2675e5-e44a-4759-8a05-db1e2b643770
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Location: /v1/accounts/qa-881f9f34af55
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6a83c39-acc4-4610-8f71-682483c6139b","handle":"qa-881f9f34af55","displayName":"QA 881f9f34af55","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.508691844Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1edc837d-9416-4681-a20c-eeae8b2fd770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1edc837d-9416-4681-a20c-eeae8b2fd770
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca4618e96f2","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1edc837d-9416-4681-a20c-eeae8b2fd770
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd2b0d46-13ea-4686-a80f-2506edc4bb8b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8f4a2122-dcd5-4e91-8ccc-ce89cbf24b8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f4a2122-dcd5-4e91-8ccc-ce89cbf24b8f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-881f9f34af55","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f4a2122-dcd5-4e91-8ccc-ce89cbf24b8f
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
Location: /v1/conversations/cnv_93c7aa66-d05e-4012-a7e9-05028f7c2df3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_93c7aa66-d05e-4012-a7e9-05028f7c2df3","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ca4618e96f2","qa-881f9f34af55"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.582057357Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-32f02891-a694-4812-8b3a-9159094b0c13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32f02891-a694-4812-8b3a-9159094b0c13
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32f02891-a694-4812-8b3a-9159094b0c13
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-32f02891-a694-4812-8b3a-9159094b0c13"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-97d14ebb-09a4-4d0c-afeb-ff45351769c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97d14ebb-09a4-4d0c-afeb-ff45351769c6
Content-Type: application/json

--- request body ---
{"handle":"qa-881f9f34af55","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-97d14ebb-09a4-4d0c-afeb-ff45351769c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6a83c39-acc4-4610-8f71-682483c6139b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ef3dace-e8f6-4899-bb4c-fb87872d21a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef3dace-e8f6-4899-bb4c-fb87872d21a6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ef3dace-e8f6-4899-bb4c-fb87872d21a6
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
correlation: qa-29823a91-16ae-4e34-b16b-5182fb06f675

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29823a91-16ae-4e34-b16b-5182fb06f675
Content-Type: application/json

--- request body ---
{"handle":"qa-881f9f34af55","password":"****"}

--- response: 401 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29823a91-16ae-4e34-b16b-5182fb06f675
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29823a91-16ae-4e34-b16b-5182fb06f675"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf1e9555-a2bd-48c3-9d4a-8c2ef014a48d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf1e9555-a2bd-48c3-9d4a-8c2ef014a48d
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf1e9555-a2bd-48c3-9d4a-8c2ef014a48d
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bab2e868-ed0b-4f8a-a953-83919f0f3476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bab2e868-ed0b-4f8a-a953-83919f0f3476
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca4618e96f2","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bab2e868-ed0b-4f8a-a953-83919f0f3476
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bab2e868-ed0b-4f8a-a953-83919f0f3476"}
```
