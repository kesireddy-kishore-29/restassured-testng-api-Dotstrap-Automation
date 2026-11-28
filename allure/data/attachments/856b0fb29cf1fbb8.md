# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-940597a0-7d54-4a4e-9f2f-04761bcc2249` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-10e80c5e-d34a-4091-821d-b817eaadb753` |
| 3 | `POST /v1/accounts` | 201 | 18 | `qa-2c73565f-d10d-41d6-9692-4022de68b288` |
| 4 | `POST /v1/auth/token` | 200 | 53 | `qa-52999d9b-4f9f-4544-ab75-42977ee1903f` |
| 5 | `POST /v1/conversations` | 201 | 24 | `qa-ef99fd86-c969-42b5-abc8-b35e084c0c34` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-6ee8a5f9-4da1-4bf2-9cc1-fbc9e1f4e647` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 11 | `qa-677d73fe-a725-4bfa-8450-8b001b3f9ce0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-464feac0-007c-4974-aa3f-ccd45f184273` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-33d4bc75-6925-4b6e-8d07-bd08b6b48313` |
| 10 | `POST /v1/auth/token` | 200 | 60 | `qa-83467e81-27d5-4e41-9954-e17194add298` |
| 11 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-d55dc18c-3151-4bd9-9331-d2ce55ad7c6b` |
| 12 | `POST /v1/auth/token` | 401 | 65 | `qa-bacf9776-450a-493d-bf5f-e380a3beb9ce` |
| 13 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-3a4c7d5e-2ae2-46f9-8e6a-b4712dc8b6ca` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-4952e4d4-af16-406a-bc68-76a96b8c681a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-940597a0-7d54-4a4e-9f2f-04761bcc2249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-940597a0-7d54-4a4e-9f2f-04761bcc2249
Content-Type: application/json

--- request body ---
{"handle":"qa-3cd2e4dd8b16","displayName":"QA 3cd2e4dd8b16","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-940597a0-7d54-4a4e-9f2f-04761bcc2249
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
Location: /v1/accounts/qa-3cd2e4dd8b16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b6ee1a9-376a-4ee0-b0de-42dc88dde5cc","handle":"qa-3cd2e4dd8b16","displayName":"QA 3cd2e4dd8b16","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.590659600Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10e80c5e-d34a-4091-821d-b817eaadb753

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10e80c5e-d34a-4091-821d-b817eaadb753
Content-Type: application/json

--- request body ---
{"handle":"qa-aa3c77b9818f","displayName":"QA aa3c77b9818f","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-10e80c5e-d34a-4091-821d-b817eaadb753
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-aa3c77b9818f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b7b83e7-fb64-4756-9437-dc87a3eba4ec","handle":"qa-aa3c77b9818f","displayName":"QA aa3c77b9818f","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.659885017Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2c73565f-d10d-41d6-9692-4022de68b288

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c73565f-d10d-41d6-9692-4022de68b288
Content-Type: application/json

--- request body ---
{"handle":"qa-dd60802711d5","displayName":"QA dd60802711d5","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c73565f-d10d-41d6-9692-4022de68b288
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Location: /v1/accounts/qa-dd60802711d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0837ef8c-9258-4f05-afa7-72dc553ba81b","handle":"qa-dd60802711d5","displayName":"QA dd60802711d5","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.689170479Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-52999d9b-4f9f-4544-ab75-42977ee1903f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52999d9b-4f9f-4544-ab75-42977ee1903f
Content-Type: application/json

--- request body ---
{"handle":"qa-3cd2e4dd8b16","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-52999d9b-4f9f-4544-ab75-42977ee1903f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b6ee1a9-376a-4ee0-b0de-42dc88dde5cc"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ef99fd86-c969-42b5-abc8-b35e084c0c34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef99fd86-c969-42b5-abc8-b35e084c0c34
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aa3c77b9818f","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef99fd86-c969-42b5-abc8-b35e084c0c34
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
Location: /v1/conversations/cnv_bd94be1e-5d50-4e3e-a0ac-99ce04e4a2e8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bd94be1e-5d50-4e3e-a0ac-99ce04e4a2e8","subject":"Error contract","status":"open","region":"eu","participants":["qa-3cd2e4dd8b16","qa-aa3c77b9818f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.822197309Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6ee8a5f9-4da1-4bf2-9cc1-fbc9e1f4e647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee8a5f9-4da1-4bf2-9cc1-fbc9e1f4e647
Content-Type: application/json

--- request body ---
{"handle":"qa-dd60802711d5","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ee8a5f9-4da1-4bf2-9cc1-fbc9e1f4e647
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0837ef8c-9258-4f05-afa7-72dc553ba81b"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_bd94be1e-5d50-4e3e-a0ac-99ce04e4a2e8/read
correlation: qa-677d73fe-a725-4bfa-8450-8b001b3f9ce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-677d73fe-a725-4bfa-8450-8b001b3f9ce0
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-677d73fe-a725-4bfa-8450-8b001b3f9ce0
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_bd94be1e-5d50-4e3e-a0ac-99ce04e4a2e8/read","correlationId":"qa-677d73fe-a725-4bfa-8450-8b001b3f9ce0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-464feac0-007c-4974-aa3f-ccd45f184273

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-464feac0-007c-4974-aa3f-ccd45f184273
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-464feac0-007c-4974-aa3f-ccd45f184273
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-33d4bc75-6925-4b6e-8d07-bd08b6b48313

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33d4bc75-6925-4b6e-8d07-bd08b6b48313
Content-Type: application/json

--- request body ---
{"handle":"qa-dd60802711d5","password":"****"}

--- response: 401 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33d4bc75-6925-4b6e-8d07-bd08b6b48313
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33d4bc75-6925-4b6e-8d07-bd08b6b48313"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-83467e81-27d5-4e41-9954-e17194add298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83467e81-27d5-4e41-9954-e17194add298
Content-Type: application/json

--- request body ---
{"handle":"qa-aa3c77b9818f","password":"****"}

--- response: 200 in 60 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-83467e81-27d5-4e41-9954-e17194add298
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b7b83e7-fb64-4756-9437-dc87a3eba4ec"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d55dc18c-3151-4bd9-9331-d2ce55ad7c6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d55dc18c-3151-4bd9-9331-d2ce55ad7c6b
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d55dc18c-3151-4bd9-9331-d2ce55ad7c6b
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-bacf9776-450a-493d-bf5f-e380a3beb9ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bacf9776-450a-493d-bf5f-e380a3beb9ce
Content-Type: application/json

--- request body ---
{"handle":"qa-aa3c77b9818f","password":"****"}

--- response: 401 in 65 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bacf9776-450a-493d-bf5f-e380a3beb9ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bacf9776-450a-493d-bf5f-e380a3beb9ce"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a4c7d5e-2ae2-46f9-8e6a-b4712dc8b6ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a4c7d5e-2ae2-46f9-8e6a-b4712dc8b6ca
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a4c7d5e-2ae2-46f9-8e6a-b4712dc8b6ca
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4952e4d4-af16-406a-bc68-76a96b8c681a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4952e4d4-af16-406a-bc68-76a96b8c681a
Content-Type: application/json

--- request body ---
{"handle":"qa-3cd2e4dd8b16","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4952e4d4-af16-406a-bc68-76a96b8c681a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4952e4d4-af16-406a-bc68-76a96b8c681a"}
```
