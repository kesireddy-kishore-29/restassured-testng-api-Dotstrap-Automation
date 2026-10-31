# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-959291db-8b0f-414c-8749-209d2516325b` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-84288db0-e88a-4704-a8ba-d1706345ac4f` |
| 3 | `POST /v1/accounts` | 201 | 31 | `qa-c7b07139-9f66-4cad-81b3-c5c4ee8dd9ee` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-1a50b79c-1ff1-4c12-99a8-57fce85f6380` |
| 5 | `POST /v1/conversations` | 201 | 20 | `qa-cfbba045-e8cb-461c-8d6c-9e9ab9125011` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-8bfc08f2-1a90-4670-8e4c-749b8164e916` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 14 | `qa-a91c557a-4723-434d-9296-2ab8b789ae96` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0bab5c16-5f30-44db-b647-3a0693b337b7` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-04d2b0ed-12c0-404e-8a0e-2b5605b50e1f` |
| 10 | `POST /v1/auth/token` | 200 | 30 | `qa-8d15e26e-78a7-477e-959e-93219b332fd0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-77b77667-430d-41f7-9bb9-3850d23f8282` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-a74a2bdb-eafe-470c-9147-70026e0ecfdf` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-2e3785de-ac8e-405d-8cd8-c6a1326a9823` |
| 14 | `POST /v1/auth/token` | 401 | 35 | `qa-951e9ce0-778f-47d5-85e6-1617db253457` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-959291db-8b0f-414c-8749-209d2516325b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-959291db-8b0f-414c-8749-209d2516325b
Content-Type: application/json

--- request body ---
{"handle":"qa-a5c874146b53","displayName":"QA a5c874146b53","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-959291db-8b0f-414c-8749-209d2516325b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-a5c874146b53
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bb61d24-6a09-4b7c-874e-b5ed4f96d093","handle":"qa-a5c874146b53","displayName":"QA a5c874146b53","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.970369673Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-84288db0-e88a-4704-a8ba-d1706345ac4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84288db0-e88a-4704-a8ba-d1706345ac4f
Content-Type: application/json

--- request body ---
{"handle":"qa-1d9b360d4c07","displayName":"QA 1d9b360d4c07","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-84288db0-e88a-4704-a8ba-d1706345ac4f
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
Location: /v1/accounts/qa-1d9b360d4c07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49451d8d-130f-4156-9e53-a56af5fd3e48","handle":"qa-1d9b360d4c07","displayName":"QA 1d9b360d4c07","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.005069656Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c7b07139-9f66-4cad-81b3-c5c4ee8dd9ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7b07139-9f66-4cad-81b3-c5c4ee8dd9ee
Content-Type: application/json

--- request body ---
{"handle":"qa-760a8e78085b","displayName":"QA 760a8e78085b","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7b07139-9f66-4cad-81b3-c5c4ee8dd9ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Location: /v1/accounts/qa-760a8e78085b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55a8e3d8-d53b-449d-acaa-705ff412b9b8","handle":"qa-760a8e78085b","displayName":"QA 760a8e78085b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.036755999Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1a50b79c-1ff1-4c12-99a8-57fce85f6380

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a50b79c-1ff1-4c12-99a8-57fce85f6380
Content-Type: application/json

--- request body ---
{"handle":"qa-a5c874146b53","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a50b79c-1ff1-4c12-99a8-57fce85f6380
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bb61d24-6a09-4b7c-874e-b5ed4f96d093"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cfbba045-e8cb-461c-8d6c-9e9ab9125011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfbba045-e8cb-461c-8d6c-9e9ab9125011
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1d9b360d4c07","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfbba045-e8cb-461c-8d6c-9e9ab9125011
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
Location: /v1/conversations/cnv_6208819d-4df8-4912-abc7-828217f099c4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6208819d-4df8-4912-abc7-828217f099c4","subject":"Error contract","status":"open","region":"eu","participants":["qa-a5c874146b53","qa-1d9b360d4c07"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.103364970Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8bfc08f2-1a90-4670-8e4c-749b8164e916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bfc08f2-1a90-4670-8e4c-749b8164e916
Content-Type: application/json

--- request body ---
{"handle":"qa-760a8e78085b","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bfc08f2-1a90-4670-8e4c-749b8164e916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55a8e3d8-d53b-449d-acaa-705ff412b9b8"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6208819d-4df8-4912-abc7-828217f099c4/close
correlation: qa-a91c557a-4723-434d-9296-2ab8b789ae96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a91c557a-4723-434d-9296-2ab8b789ae96
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a91c557a-4723-434d-9296-2ab8b789ae96
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6208819d-4df8-4912-abc7-828217f099c4/close","correlationId":"qa-a91c557a-4723-434d-9296-2ab8b789ae96"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0bab5c16-5f30-44db-b647-3a0693b337b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bab5c16-5f30-44db-b647-3a0693b337b7
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0bab5c16-5f30-44db-b647-3a0693b337b7
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
correlation: qa-04d2b0ed-12c0-404e-8a0e-2b5605b50e1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d2b0ed-12c0-404e-8a0e-2b5605b50e1f
Content-Type: application/json

--- request body ---
{"handle":"qa-760a8e78085b","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04d2b0ed-12c0-404e-8a0e-2b5605b50e1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04d2b0ed-12c0-404e-8a0e-2b5605b50e1f"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8d15e26e-78a7-477e-959e-93219b332fd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d15e26e-78a7-477e-959e-93219b332fd0
Content-Type: application/json

--- request body ---
{"handle":"qa-1d9b360d4c07","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d15e26e-78a7-477e-959e-93219b332fd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49451d8d-130f-4156-9e53-a56af5fd3e48"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77b77667-430d-41f7-9bb9-3850d23f8282

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77b77667-430d-41f7-9bb9-3850d23f8282
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77b77667-430d-41f7-9bb9-3850d23f8282
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
correlation: qa-a74a2bdb-eafe-470c-9147-70026e0ecfdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a74a2bdb-eafe-470c-9147-70026e0ecfdf
Content-Type: application/json

--- request body ---
{"handle":"qa-1d9b360d4c07","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a74a2bdb-eafe-470c-9147-70026e0ecfdf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a74a2bdb-eafe-470c-9147-70026e0ecfdf"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e3785de-ac8e-405d-8cd8-c6a1326a9823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e3785de-ac8e-405d-8cd8-c6a1326a9823
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e3785de-ac8e-405d-8cd8-c6a1326a9823
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-951e9ce0-778f-47d5-85e6-1617db253457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951e9ce0-778f-47d5-85e6-1617db253457
Content-Type: application/json

--- request body ---
{"handle":"qa-a5c874146b53","password":"****"}

--- response: 401 in 35 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-951e9ce0-778f-47d5-85e6-1617db253457
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-951e9ce0-778f-47d5-85e6-1617db253457"}
```
