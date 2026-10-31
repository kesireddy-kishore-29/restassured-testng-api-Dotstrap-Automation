# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-4ff3604e-6a8c-4d99-bac0-9e50de381f3a` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-f81214aa-a716-4a09-b440-b0f8bbf18410` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-ffe7be63-37ec-48e2-b064-8dded0bcb597` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-905dbfa1-c586-4dfc-a766-6b417488a62e` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 16 | `qa-1d345649-95e6-459d-a6da-56b0f2bb62bb` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-194a009f-86b6-40f3-90c9-109d2bb06ded` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-76eb2d4e-399c-4510-aa49-e42a9bad0bc1` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-bc97e680-e8a5-426c-b129-fc339bab6ee0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-590b3203-2981-4cdc-a30b-8145fff5787a` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-24ecc92a-c963-4001-9121-992dc42d2dba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ff3604e-6a8c-4d99-bac0-9e50de381f3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ff3604e-6a8c-4d99-bac0-9e50de381f3a
Content-Type: application/json

--- request body ---
{"handle":"qa-08fc74ad2008","displayName":"QA 08fc74ad2008","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ff3604e-6a8c-4d99-bac0-9e50de381f3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-08fc74ad2008
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5c81ba9-08a5-44dd-9c6d-54a7fbaf7aaa","handle":"qa-08fc74ad2008","displayName":"QA 08fc74ad2008","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.303316486Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f81214aa-a716-4a09-b440-b0f8bbf18410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f81214aa-a716-4a09-b440-b0f8bbf18410
Content-Type: application/json

--- request body ---
{"handle":"qa-77d677151fff","displayName":"QA 77d677151fff","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f81214aa-a716-4a09-b440-b0f8bbf18410
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-77d677151fff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0427c519-5add-4f54-a315-7df1945f04dd","handle":"qa-77d677151fff","displayName":"QA 77d677151fff","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.331801166Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ffe7be63-37ec-48e2-b064-8dded0bcb597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffe7be63-37ec-48e2-b064-8dded0bcb597
Content-Type: application/json

--- request body ---
{"handle":"qa-08fc74ad2008","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffe7be63-37ec-48e2-b064-8dded0bcb597
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5c81ba9-08a5-44dd-9c6d-54a7fbaf7aaa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-905dbfa1-c586-4dfc-a766-6b417488a62e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905dbfa1-c586-4dfc-a766-6b417488a62e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-77d677151fff","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-905dbfa1-c586-4dfc-a766-6b417488a62e
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
Location: /v1/conversations/cnv_4f1ad5f9-7868-4db8-8bf1-9e680c2bfdf8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4f1ad5f9-7868-4db8-8bf1-9e680c2bfdf8","subject":"Error contract","status":"open","region":"eu","participants":["qa-08fc74ad2008","qa-77d677151fff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.398195082Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_4f1ad5f9-7868-4db8-8bf1-9e680c2bfdf8/messages
correlation: qa-1d345649-95e6-459d-a6da-56b0f2bb62bb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ec289ede-159d-43f5-8aa4-2fb21e2ededd
X-Correlation-Id: qa-1d345649-95e6-459d-a6da-56b0f2bb62bb
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d345649-95e6-459d-a6da-56b0f2bb62bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_4f1ad5f9-7868-4db8-8bf1-9e680c2bfdf8/messages","correlationId":"qa-1d345649-95e6-459d-a6da-56b0f2bb62bb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-194a009f-86b6-40f3-90c9-109d2bb06ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194a009f-86b6-40f3-90c9-109d2bb06ded
Content-Type: application/json

--- request body ---
{"handle":"qa-77d677151fff","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-194a009f-86b6-40f3-90c9-109d2bb06ded
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0427c519-5add-4f54-a315-7df1945f04dd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76eb2d4e-399c-4510-aa49-e42a9bad0bc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76eb2d4e-399c-4510-aa49-e42a9bad0bc1
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76eb2d4e-399c-4510-aa49-e42a9bad0bc1
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
correlation: qa-bc97e680-e8a5-426c-b129-fc339bab6ee0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc97e680-e8a5-426c-b129-fc339bab6ee0
Content-Type: application/json

--- request body ---
{"handle":"qa-77d677151fff","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc97e680-e8a5-426c-b129-fc339bab6ee0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc97e680-e8a5-426c-b129-fc339bab6ee0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-590b3203-2981-4cdc-a30b-8145fff5787a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-590b3203-2981-4cdc-a30b-8145fff5787a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-590b3203-2981-4cdc-a30b-8145fff5787a
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
correlation: qa-24ecc92a-c963-4001-9121-992dc42d2dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24ecc92a-c963-4001-9121-992dc42d2dba
Content-Type: application/json

--- request body ---
{"handle":"qa-08fc74ad2008","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24ecc92a-c963-4001-9121-992dc42d2dba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24ecc92a-c963-4001-9121-992dc42d2dba"}
```
