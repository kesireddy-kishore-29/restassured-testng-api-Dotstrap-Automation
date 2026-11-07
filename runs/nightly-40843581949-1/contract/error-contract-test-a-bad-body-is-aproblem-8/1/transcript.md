# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-8c0a09af-b2dd-4f6c-bbab-7d2060428fec` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-fdcfe530-82c2-4415-a824-a2c490282b62` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-0bac0e31-b751-498c-b85a-53760d5bbacd` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-cc97b5aa-42e6-47b6-a0dd-8791788aec7d` |
| 5 | `PATCH /v1/accounts/me` | 422 | 24 | `qa-47d5bf6f-9126-4bf3-b377-6f223ac36beb` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-39fe2290-14f5-4953-9246-425c6dcdbbce` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c0b0816c-2c4e-4ec6-8be1-af0860860b74` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-24db5d34-64cf-42d2-9cfa-702baebfd12a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-9136a770-27aa-4744-8af4-4558e623557e` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-1ca9f2f9-2d09-4182-98e4-63f871368d63` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c0a09af-b2dd-4f6c-bbab-7d2060428fec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c0a09af-b2dd-4f6c-bbab-7d2060428fec
Content-Type: application/json

--- request body ---
{"handle":"qa-0e01c8afbf32","displayName":"QA 0e01c8afbf32","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c0a09af-b2dd-4f6c-bbab-7d2060428fec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Location: /v1/accounts/qa-0e01c8afbf32
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3fa7ef4-ace9-46c3-a723-32b7de4aa481","handle":"qa-0e01c8afbf32","displayName":"QA 0e01c8afbf32","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.369311573Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fdcfe530-82c2-4415-a824-a2c490282b62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdcfe530-82c2-4415-a824-a2c490282b62
Content-Type: application/json

--- request body ---
{"handle":"qa-4b728b24f3d2","displayName":"QA 4b728b24f3d2","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdcfe530-82c2-4415-a824-a2c490282b62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Location: /v1/accounts/qa-4b728b24f3d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f975864-a8ca-4805-b852-550880e0be0f","handle":"qa-4b728b24f3d2","displayName":"QA 4b728b24f3d2","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.436251646Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0bac0e31-b751-498c-b85a-53760d5bbacd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bac0e31-b751-498c-b85a-53760d5bbacd
Content-Type: application/json

--- request body ---
{"handle":"qa-0e01c8afbf32","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bac0e31-b751-498c-b85a-53760d5bbacd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3fa7ef4-ace9-46c3-a723-32b7de4aa481"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cc97b5aa-42e6-47b6-a0dd-8791788aec7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc97b5aa-42e6-47b6-a0dd-8791788aec7d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4b728b24f3d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc97b5aa-42e6-47b6-a0dd-8791788aec7d
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
Location: /v1/conversations/cnv_6173ddc8-2f06-4283-bfa2-22ebdc4e5bd7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6173ddc8-2f06-4283-bfa2-22ebdc4e5bd7","subject":"Error contract","status":"open","region":"eu","participants":["qa-0e01c8afbf32","qa-4b728b24f3d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.525875532Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-47d5bf6f-9126-4bf3-b377-6f223ac36beb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47d5bf6f-9126-4bf3-b377-6f223ac36beb
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47d5bf6f-9126-4bf3-b377-6f223ac36beb
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-47d5bf6f-9126-4bf3-b377-6f223ac36beb","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-39fe2290-14f5-4953-9246-425c6dcdbbce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39fe2290-14f5-4953-9246-425c6dcdbbce
Content-Type: application/json

--- request body ---
{"handle":"qa-4b728b24f3d2","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-39fe2290-14f5-4953-9246-425c6dcdbbce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f975864-a8ca-4805-b852-550880e0be0f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c0b0816c-2c4e-4ec6-8be1-af0860860b74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0b0816c-2c4e-4ec6-8be1-af0860860b74
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c0b0816c-2c4e-4ec6-8be1-af0860860b74
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
correlation: qa-24db5d34-64cf-42d2-9cfa-702baebfd12a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24db5d34-64cf-42d2-9cfa-702baebfd12a
Content-Type: application/json

--- request body ---
{"handle":"qa-4b728b24f3d2","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24db5d34-64cf-42d2-9cfa-702baebfd12a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24db5d34-64cf-42d2-9cfa-702baebfd12a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9136a770-27aa-4744-8af4-4558e623557e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9136a770-27aa-4744-8af4-4558e623557e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9136a770-27aa-4744-8af4-4558e623557e
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
correlation: qa-1ca9f2f9-2d09-4182-98e4-63f871368d63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ca9f2f9-2d09-4182-98e4-63f871368d63
Content-Type: application/json

--- request body ---
{"handle":"qa-0e01c8afbf32","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ca9f2f9-2d09-4182-98e4-63f871368d63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ca9f2f9-2d09-4182-98e4-63f871368d63"}
```
