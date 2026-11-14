# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-94d182dd-81a2-42cb-99fd-62c7827503a5` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-a8b95c53-a9a6-47a6-9469-1572776e68d2` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-224dc870-e697-4b34-b8fd-36f33be4ecbb` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-33f74911-b12d-41ec-9953-7f4252c6fc24` |
| 5 | `POST /v1/accounts` | 415 | 11 | `qa-cfec12d1-4ffc-49c3-adc5-4deb7211faf8` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-fa68dafd-1339-4907-8874-352681c68f40` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-c8896e68-7b7c-45bb-863b-412d38b77225` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-83476da8-8748-4cdc-af72-df264c9d38ca` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-4a19abf5-f6a2-46a6-8e94-3ae4bee2a1ef` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-5f54788c-73ba-4375-91f8-b60232edcefe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94d182dd-81a2-42cb-99fd-62c7827503a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94d182dd-81a2-42cb-99fd-62c7827503a5
Content-Type: application/json

--- request body ---
{"handle":"qa-b2b039b97bef","displayName":"QA b2b039b97bef","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-94d182dd-81a2-42cb-99fd-62c7827503a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Location: /v1/accounts/qa-b2b039b97bef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b37114b-b3c3-4a30-b101-76414277376d","handle":"qa-b2b039b97bef","displayName":"QA b2b039b97bef","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.844350241Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a8b95c53-a9a6-47a6-9469-1572776e68d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8b95c53-a9a6-47a6-9469-1572776e68d2
Content-Type: application/json

--- request body ---
{"handle":"qa-62054288983c","displayName":"QA 62054288983c","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8b95c53-a9a6-47a6-9469-1572776e68d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Location: /v1/accounts/qa-62054288983c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9436c9a-a066-4465-ad23-8ea1734ef545","handle":"qa-62054288983c","displayName":"QA 62054288983c","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.874495295Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-224dc870-e697-4b34-b8fd-36f33be4ecbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-224dc870-e697-4b34-b8fd-36f33be4ecbb
Content-Type: application/json

--- request body ---
{"handle":"qa-b2b039b97bef","password":"****"}

--- response: 200 in 45 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-224dc870-e697-4b34-b8fd-36f33be4ecbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b37114b-b3c3-4a30-b101-76414277376d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33f74911-b12d-41ec-9953-7f4252c6fc24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33f74911-b12d-41ec-9953-7f4252c6fc24
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-62054288983c","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-33f74911-b12d-41ec-9953-7f4252c6fc24
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
Location: /v1/conversations/cnv_4531908e-e8d4-4d2d-82a6-9a9f0c2168fc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4531908e-e8d4-4d2d-82a6-9a9f0c2168fc","subject":"Error contract","status":"open","region":"eu","participants":["qa-b2b039b97bef","qa-62054288983c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.976604598Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-cfec12d1-4ffc-49c3-adc5-4deb7211faf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfec12d1-4ffc-49c3-adc5-4deb7211faf8
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfec12d1-4ffc-49c3-adc5-4deb7211faf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-cfec12d1-4ffc-49c3-adc5-4deb7211faf8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fa68dafd-1339-4907-8874-352681c68f40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa68dafd-1339-4907-8874-352681c68f40
Content-Type: application/json

--- request body ---
{"handle":"qa-62054288983c","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa68dafd-1339-4907-8874-352681c68f40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9436c9a-a066-4465-ad23-8ea1734ef545"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8896e68-7b7c-45bb-863b-412d38b77225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8896e68-7b7c-45bb-863b-412d38b77225
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c8896e68-7b7c-45bb-863b-412d38b77225
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
correlation: qa-83476da8-8748-4cdc-af72-df264c9d38ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83476da8-8748-4cdc-af72-df264c9d38ca
Content-Type: application/json

--- request body ---
{"handle":"qa-62054288983c","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83476da8-8748-4cdc-af72-df264c9d38ca
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83476da8-8748-4cdc-af72-df264c9d38ca"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a19abf5-f6a2-46a6-8e94-3ae4bee2a1ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a19abf5-f6a2-46a6-8e94-3ae4bee2a1ef
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a19abf5-f6a2-46a6-8e94-3ae4bee2a1ef
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
correlation: qa-5f54788c-73ba-4375-91f8-b60232edcefe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f54788c-73ba-4375-91f8-b60232edcefe
Content-Type: application/json

--- request body ---
{"handle":"qa-b2b039b97bef","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f54788c-73ba-4375-91f8-b60232edcefe
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f54788c-73ba-4375-91f8-b60232edcefe"}
```
