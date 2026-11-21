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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-d6847ecc-cabf-4001-a2ee-2c5d5b37f6d5` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-a157ace7-3777-4daf-9702-03ced31e0a3d` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-69bf3009-0060-485f-b6dc-91b81b0bb065` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-4ed97f39-011e-42f4-b6dd-e69933d4c400` |
| 5 | `POST /v1/auth/token` | 415 | 41 | `qa-851307ef-ba45-483f-9ae0-57dd32ba0101` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-ab610c64-9bbf-4134-93c4-9eea2d3b142c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c25090f9-cf98-47ef-a3a7-017365f32080` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-865cac57-762c-460a-b4f0-6a6b6362b06d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-32b058d9-6e83-4aba-a85e-f0edcc947c19` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-fd0ee716-fd5f-4e18-8c35-7ad78d9acbff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d6847ecc-cabf-4001-a2ee-2c5d5b37f6d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6847ecc-cabf-4001-a2ee-2c5d5b37f6d5
Content-Type: application/json

--- request body ---
{"handle":"qa-b061a2258480","displayName":"QA b061a2258480","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6847ecc-cabf-4001-a2ee-2c5d5b37f6d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-b061a2258480
X-Served-Region: eu
Content-Length: 181

{"id":"acc_67d85ae4-0362-4f5f-80cc-ce9e950834b3","handle":"qa-b061a2258480","displayName":"QA b061a2258480","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.407164259Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a157ace7-3777-4daf-9702-03ced31e0a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a157ace7-3777-4daf-9702-03ced31e0a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee965f8c8f4","displayName":"QA 5ee965f8c8f4","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a157ace7-3777-4daf-9702-03ced31e0a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-5ee965f8c8f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24868902-de44-4afb-a86b-2ff81d5a193a","handle":"qa-5ee965f8c8f4","displayName":"QA 5ee965f8c8f4","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.452016143Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-69bf3009-0060-485f-b6dc-91b81b0bb065

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69bf3009-0060-485f-b6dc-91b81b0bb065
Content-Type: application/json

--- request body ---
{"handle":"qa-b061a2258480","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-69bf3009-0060-485f-b6dc-91b81b0bb065
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67d85ae4-0362-4f5f-80cc-ce9e950834b3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4ed97f39-011e-42f4-b6dd-e69933d4c400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ed97f39-011e-42f4-b6dd-e69933d4c400
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ee965f8c8f4","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ed97f39-011e-42f4-b6dd-e69933d4c400
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
Location: /v1/conversations/cnv_1684291e-00c4-4601-a736-d2f699f7fd25
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1684291e-00c4-4601-a736-d2f699f7fd25","subject":"Error contract","status":"open","region":"eu","participants":["qa-b061a2258480","qa-5ee965f8c8f4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.589476833Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-851307ef-ba45-483f-9ae0-57dd32ba0101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-851307ef-ba45-483f-9ae0-57dd32ba0101
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-851307ef-ba45-483f-9ae0-57dd32ba0101
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-851307ef-ba45-483f-9ae0-57dd32ba0101"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ab610c64-9bbf-4134-93c4-9eea2d3b142c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab610c64-9bbf-4134-93c4-9eea2d3b142c
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee965f8c8f4","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab610c64-9bbf-4134-93c4-9eea2d3b142c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24868902-de44-4afb-a86b-2ff81d5a193a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c25090f9-cf98-47ef-a3a7-017365f32080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c25090f9-cf98-47ef-a3a7-017365f32080
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c25090f9-cf98-47ef-a3a7-017365f32080
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
correlation: qa-865cac57-762c-460a-b4f0-6a6b6362b06d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-865cac57-762c-460a-b4f0-6a6b6362b06d
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee965f8c8f4","password":"****"}

--- response: 401 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-865cac57-762c-460a-b4f0-6a6b6362b06d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-865cac57-762c-460a-b4f0-6a6b6362b06d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32b058d9-6e83-4aba-a85e-f0edcc947c19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b058d9-6e83-4aba-a85e-f0edcc947c19
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32b058d9-6e83-4aba-a85e-f0edcc947c19
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
correlation: qa-fd0ee716-fd5f-4e18-8c35-7ad78d9acbff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd0ee716-fd5f-4e18-8c35-7ad78d9acbff
Content-Type: application/json

--- request body ---
{"handle":"qa-b061a2258480","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd0ee716-fd5f-4e18-8c35-7ad78d9acbff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fd0ee716-fd5f-4e18-8c35-7ad78d9acbff"}
```
