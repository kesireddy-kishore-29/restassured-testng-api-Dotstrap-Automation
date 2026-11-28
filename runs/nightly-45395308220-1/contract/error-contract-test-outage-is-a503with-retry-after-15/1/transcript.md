# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-749f9082-1b83-4080-8a77-708940fd1682` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-d01287e2-2f1d-4b06-a620-e93d3386e90d` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-1a56c379-3d49-40cb-8641-451290b0b34d` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-312e41c9-9aeb-41b8-98f8-784d6b41ece6` |
| 5 | `POST /v1/credits/purchases` | 503 | 29 | `qa-aaa702cb-29f5-41e1-9f29-249d9be348b7` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-1bf61b5c-2483-4f11-99f7-eee377e10c1e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a01fbf46-0041-443b-a2a0-1b46d2b64cf3` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-58319376-f914-4d90-b803-0a33a11ceab9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-00132f9b-6244-4e34-9315-c8dfb7f0d198` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-f82e928e-bd5d-4f58-a128-c9db17bad772` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-749f9082-1b83-4080-8a77-708940fd1682

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-749f9082-1b83-4080-8a77-708940fd1682
Content-Type: application/json

--- request body ---
{"handle":"qa-8577193af900","displayName":"QA 8577193af900","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-749f9082-1b83-4080-8a77-708940fd1682
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Location: /v1/accounts/qa-8577193af900
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7744100d-7b4c-4fb2-988c-16fffe88bcf4","handle":"qa-8577193af900","displayName":"QA 8577193af900","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.466450016Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d01287e2-2f1d-4b06-a620-e93d3386e90d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01287e2-2f1d-4b06-a620-e93d3386e90d
Content-Type: application/json

--- request body ---
{"handle":"qa-ecd2b73cb64c","displayName":"QA ecd2b73cb64c","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d01287e2-2f1d-4b06-a620-e93d3386e90d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-ecd2b73cb64c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f53d8f90-4027-499d-9d72-f860345a6aa1","handle":"qa-ecd2b73cb64c","displayName":"QA ecd2b73cb64c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.499434454Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1a56c379-3d49-40cb-8641-451290b0b34d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a56c379-3d49-40cb-8641-451290b0b34d
Content-Type: application/json

--- request body ---
{"handle":"qa-8577193af900","password":"****"}

--- response: 200 in 59 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a56c379-3d49-40cb-8641-451290b0b34d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7744100d-7b4c-4fb2-988c-16fffe88bcf4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-312e41c9-9aeb-41b8-98f8-784d6b41ece6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-312e41c9-9aeb-41b8-98f8-784d6b41ece6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ecd2b73cb64c","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-312e41c9-9aeb-41b8-98f8-784d6b41ece6
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
Location: /v1/conversations/cnv_6a7f65ab-4fb6-4778-ad71-95084fa98a34
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6a7f65ab-4fb6-4778-ad71-95084fa98a34","subject":"Error contract","status":"open","region":"eu","participants":["qa-8577193af900","qa-ecd2b73cb64c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.588797292Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-aaa702cb-29f5-41e1-9f29-249d9be348b7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
Idempotency-Key: qa-d7a08ca21fc24b9cb71f051fed01fc0d
X-Fault-Key: 5e5943da-938b-45ef-8322-5f22e5684c4f
X-Correlation-Id: qa-aaa702cb-29f5-41e1-9f29-249d9be348b7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aaa702cb-29f5-41e1-9f29-249d9be348b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-aaa702cb-29f5-41e1-9f29-249d9be348b7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1bf61b5c-2483-4f11-99f7-eee377e10c1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bf61b5c-2483-4f11-99f7-eee377e10c1e
Content-Type: application/json

--- request body ---
{"handle":"qa-ecd2b73cb64c","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bf61b5c-2483-4f11-99f7-eee377e10c1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f53d8f90-4027-499d-9d72-f860345a6aa1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a01fbf46-0041-443b-a2a0-1b46d2b64cf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01fbf46-0041-443b-a2a0-1b46d2b64cf3
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a01fbf46-0041-443b-a2a0-1b46d2b64cf3
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
correlation: qa-58319376-f914-4d90-b803-0a33a11ceab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58319376-f914-4d90-b803-0a33a11ceab9
Content-Type: application/json

--- request body ---
{"handle":"qa-ecd2b73cb64c","password":"****"}

--- response: 401 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58319376-f914-4d90-b803-0a33a11ceab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58319376-f914-4d90-b803-0a33a11ceab9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00132f9b-6244-4e34-9315-c8dfb7f0d198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00132f9b-6244-4e34-9315-c8dfb7f0d198
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00132f9b-6244-4e34-9315-c8dfb7f0d198
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
correlation: qa-f82e928e-bd5d-4f58-a128-c9db17bad772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f82e928e-bd5d-4f58-a128-c9db17bad772
Content-Type: application/json

--- request body ---
{"handle":"qa-8577193af900","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f82e928e-bd5d-4f58-a128-c9db17bad772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f82e928e-bd5d-4f58-a128-c9db17bad772"}
```
