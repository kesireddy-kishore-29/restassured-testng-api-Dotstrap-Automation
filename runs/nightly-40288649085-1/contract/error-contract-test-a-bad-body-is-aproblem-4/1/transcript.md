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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-518b5e69-af11-4331-9259-14e25e339256` |
| 2 | `POST /v1/accounts` | 201 | 65 | `qa-421de368-a24e-4100-ab7c-5ea464df28d5` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-f150d083-a7e0-4fe9-8c4d-66e19f7e4b01` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-2a9ff658-b42c-4d8d-b402-337c2ca0f08d` |
| 5 | `POST /v1/accounts` | 415 | 19 | `qa-4a5522fe-b3d0-4a29-b133-53ab5706a83d` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-023d9826-6fcf-49dd-8377-841b986dc4a5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-5ab85495-cc80-4750-a9a2-37c635f55a1f` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-560dcf2c-5de2-4948-8e56-ac3a453515df` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-06e38584-a389-4c8b-a3c2-643675684026` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-97214328-3c96-42ad-afb5-6473e1a3560b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-518b5e69-af11-4331-9259-14e25e339256

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-518b5e69-af11-4331-9259-14e25e339256
Content-Type: application/json

--- request body ---
{"handle":"qa-46f5a01667b1","displayName":"QA 46f5a01667b1","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-518b5e69-af11-4331-9259-14e25e339256
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-46f5a01667b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3adba14e-b9be-4b44-9ca8-911facb0b52b","handle":"qa-46f5a01667b1","displayName":"QA 46f5a01667b1","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.544404134Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-421de368-a24e-4100-ab7c-5ea464df28d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-421de368-a24e-4100-ab7c-5ea464df28d5
Content-Type: application/json

--- request body ---
{"handle":"qa-ba9d9fda7fe6","displayName":"QA ba9d9fda7fe6","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-421de368-a24e-4100-ab7c-5ea464df28d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Location: /v1/accounts/qa-ba9d9fda7fe6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44c8b53e-cae0-4b47-aad3-e25a5f5fe723","handle":"qa-ba9d9fda7fe6","displayName":"QA ba9d9fda7fe6","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.640238266Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f150d083-a7e0-4fe9-8c4d-66e19f7e4b01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f150d083-a7e0-4fe9-8c4d-66e19f7e4b01
Content-Type: application/json

--- request body ---
{"handle":"qa-46f5a01667b1","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f150d083-a7e0-4fe9-8c4d-66e19f7e4b01
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3adba14e-b9be-4b44-9ca8-911facb0b52b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2a9ff658-b42c-4d8d-b402-337c2ca0f08d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a9ff658-b42c-4d8d-b402-337c2ca0f08d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ba9d9fda7fe6","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a9ff658-b42c-4d8d-b402-337c2ca0f08d
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
Location: /v1/conversations/cnv_02677807-d50b-4dc4-b01c-eb94d3c8dee3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_02677807-d50b-4dc4-b01c-eb94d3c8dee3","subject":"Error contract","status":"open","region":"eu","participants":["qa-46f5a01667b1","qa-ba9d9fda7fe6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.739388101Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-4a5522fe-b3d0-4a29-b133-53ab5706a83d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a5522fe-b3d0-4a29-b133-53ab5706a83d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a5522fe-b3d0-4a29-b133-53ab5706a83d
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
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-4a5522fe-b3d0-4a29-b133-53ab5706a83d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-023d9826-6fcf-49dd-8377-841b986dc4a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-023d9826-6fcf-49dd-8377-841b986dc4a5
Content-Type: application/json

--- request body ---
{"handle":"qa-ba9d9fda7fe6","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-023d9826-6fcf-49dd-8377-841b986dc4a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44c8b53e-cae0-4b47-aad3-e25a5f5fe723"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ab85495-cc80-4750-a9a2-37c635f55a1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ab85495-cc80-4750-a9a2-37c635f55a1f
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ab85495-cc80-4750-a9a2-37c635f55a1f
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
correlation: qa-560dcf2c-5de2-4948-8e56-ac3a453515df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-560dcf2c-5de2-4948-8e56-ac3a453515df
Content-Type: application/json

--- request body ---
{"handle":"qa-ba9d9fda7fe6","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-560dcf2c-5de2-4948-8e56-ac3a453515df
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-560dcf2c-5de2-4948-8e56-ac3a453515df"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06e38584-a389-4c8b-a3c2-643675684026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06e38584-a389-4c8b-a3c2-643675684026
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06e38584-a389-4c8b-a3c2-643675684026
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
correlation: qa-97214328-3c96-42ad-afb5-6473e1a3560b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97214328-3c96-42ad-afb5-6473e1a3560b
Content-Type: application/json

--- request body ---
{"handle":"qa-46f5a01667b1","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97214328-3c96-42ad-afb5-6473e1a3560b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97214328-3c96-42ad-afb5-6473e1a3560b"}
```
