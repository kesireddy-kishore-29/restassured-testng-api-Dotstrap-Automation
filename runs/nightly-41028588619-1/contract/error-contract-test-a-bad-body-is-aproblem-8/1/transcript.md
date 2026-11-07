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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-9627c9c2-1555-4231-8f41-d27b3e422aa4` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-4f7ecc9f-1573-49a4-a379-60be57ec7064` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-292b8b0a-8f89-41fb-9dc6-a06eac74e732` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-1d53cf21-d3fd-4935-861c-468e71c71835` |
| 5 | `PATCH /v1/accounts/me` | 422 | 46 | `qa-65ebbfba-e40c-493c-bb74-fe864fbff4b4` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-df317685-60e7-4cb7-bb12-439096d4ed8e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-328dca77-5363-4d1e-8627-a28df4606edf` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-a4cc8637-7a98-49d6-ba9e-aa1e65bb60e1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-88ccb427-3f4f-4228-9d20-4f15b7d642d2` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-9b74509e-1a91-47e7-8706-99ba2e527fdd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9627c9c2-1555-4231-8f41-d27b3e422aa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9627c9c2-1555-4231-8f41-d27b3e422aa4
Content-Type: application/json

--- request body ---
{"handle":"qa-774910968167","displayName":"QA 774910968167","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9627c9c2-1555-4231-8f41-d27b3e422aa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Location: /v1/accounts/qa-774910968167
X-Served-Region: eu
Content-Length: 181

{"id":"acc_adfb84c8-fce3-4700-be1b-ef95c2b0d4f5","handle":"qa-774910968167","displayName":"QA 774910968167","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.464632300Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4f7ecc9f-1573-49a4-a379-60be57ec7064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f7ecc9f-1573-49a4-a379-60be57ec7064
Content-Type: application/json

--- request body ---
{"handle":"qa-f425c6856d70","displayName":"QA f425c6856d70","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f7ecc9f-1573-49a4-a379-60be57ec7064
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Location: /v1/accounts/qa-f425c6856d70
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23584756-6585-4f2b-bb4a-50d91787f7aa","handle":"qa-f425c6856d70","displayName":"QA f425c6856d70","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.552722225Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-292b8b0a-8f89-41fb-9dc6-a06eac74e732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-292b8b0a-8f89-41fb-9dc6-a06eac74e732
Content-Type: application/json

--- request body ---
{"handle":"qa-774910968167","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-292b8b0a-8f89-41fb-9dc6-a06eac74e732
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_adfb84c8-fce3-4700-be1b-ef95c2b0d4f5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1d53cf21-d3fd-4935-861c-468e71c71835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d53cf21-d3fd-4935-861c-468e71c71835
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f425c6856d70","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d53cf21-d3fd-4935-861c-468e71c71835
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
Location: /v1/conversations/cnv_a9531ee2-05f1-4632-97be-6b02bb98587f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a9531ee2-05f1-4632-97be-6b02bb98587f","subject":"Error contract","status":"open","region":"eu","participants":["qa-774910968167","qa-f425c6856d70"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.654499602Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-65ebbfba-e40c-493c-bb74-fe864fbff4b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65ebbfba-e40c-493c-bb74-fe864fbff4b4
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 46 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65ebbfba-e40c-493c-bb74-fe864fbff4b4
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-65ebbfba-e40c-493c-bb74-fe864fbff4b4","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-df317685-60e7-4cb7-bb12-439096d4ed8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df317685-60e7-4cb7-bb12-439096d4ed8e
Content-Type: application/json

--- request body ---
{"handle":"qa-f425c6856d70","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-df317685-60e7-4cb7-bb12-439096d4ed8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23584756-6585-4f2b-bb4a-50d91787f7aa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-328dca77-5363-4d1e-8627-a28df4606edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-328dca77-5363-4d1e-8627-a28df4606edf
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-328dca77-5363-4d1e-8627-a28df4606edf
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
correlation: qa-a4cc8637-7a98-49d6-ba9e-aa1e65bb60e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4cc8637-7a98-49d6-ba9e-aa1e65bb60e1
Content-Type: application/json

--- request body ---
{"handle":"qa-f425c6856d70","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4cc8637-7a98-49d6-ba9e-aa1e65bb60e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4cc8637-7a98-49d6-ba9e-aa1e65bb60e1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88ccb427-3f4f-4228-9d20-4f15b7d642d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88ccb427-3f4f-4228-9d20-4f15b7d642d2
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88ccb427-3f4f-4228-9d20-4f15b7d642d2
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
correlation: qa-9b74509e-1a91-47e7-8706-99ba2e527fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b74509e-1a91-47e7-8706-99ba2e527fdd
Content-Type: application/json

--- request body ---
{"handle":"qa-774910968167","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b74509e-1a91-47e7-8706-99ba2e527fdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b74509e-1a91-47e7-8706-99ba2e527fdd"}
```
