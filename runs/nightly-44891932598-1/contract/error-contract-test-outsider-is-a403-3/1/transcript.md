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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-109cb529-2f08-4bd8-98ec-ef2e1ddf2c21` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-cf6d3621-cacd-47bb-b394-39f96c1d1967` |
| 3 | `POST /v1/accounts` | 201 | 72 | `qa-3a2b2e02-b7da-472b-9e6d-786cfb610d74` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-f11ec274-b1eb-4edd-af65-765d8eea7db4` |
| 5 | `POST /v1/conversations` | 201 | 28 | `qa-8dc1f335-ba54-469d-90a9-b87ffa666fa7` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-be7563fd-d446-4f13-a12f-98fdf1901e9d` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 21 | `qa-985e409b-c91e-42e0-b2f5-8c5ee917119b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-ab2e36f5-08c5-4a38-9512-a3085196b937` |
| 9 | `POST /v1/auth/token` | 401 | 41 | `qa-a31759c8-81ed-479b-92d4-ccf9deef9c9e` |
| 10 | `POST /v1/auth/token` | 200 | 29 | `qa-ce7210ab-2276-4d77-86de-dbe5ed7bf594` |
| 11 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-9f08357c-78de-41be-8740-aa3edc4ec30b` |
| 12 | `POST /v1/auth/token` | 401 | 38 | `qa-681ca898-84b3-4402-84de-af796ac863d2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-68f7b696-0d25-456a-8d60-325f137f4569` |
| 14 | `POST /v1/auth/token` | 401 | 25 | `qa-84d63e9e-0a86-46b5-8a8c-7e0b2fbc6bd7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-109cb529-2f08-4bd8-98ec-ef2e1ddf2c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-109cb529-2f08-4bd8-98ec-ef2e1ddf2c21
Content-Type: application/json

--- request body ---
{"handle":"qa-511a47a3c5eb","displayName":"QA 511a47a3c5eb","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-109cb529-2f08-4bd8-98ec-ef2e1ddf2c21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-511a47a3c5eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d2e6701-a659-4be1-bbe0-a77dda8fe761","handle":"qa-511a47a3c5eb","displayName":"QA 511a47a3c5eb","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.374815125Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cf6d3621-cacd-47bb-b394-39f96c1d1967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6d3621-cacd-47bb-b394-39f96c1d1967
Content-Type: application/json

--- request body ---
{"handle":"qa-b8226c29c6b7","displayName":"QA b8226c29c6b7","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf6d3621-cacd-47bb-b394-39f96c1d1967
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-b8226c29c6b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_57a79700-cfaa-4448-8480-412489da2015","handle":"qa-b8226c29c6b7","displayName":"QA b8226c29c6b7","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.420287672Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-3a2b2e02-b7da-472b-9e6d-786cfb610d74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a2b2e02-b7da-472b-9e6d-786cfb610d74
Content-Type: application/json

--- request body ---
{"handle":"qa-306a33f6748e","displayName":"QA 306a33f6748e","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a2b2e02-b7da-472b-9e6d-786cfb610d74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Location: /v1/accounts/qa-306a33f6748e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd0a7b1e-72c0-4e7f-b89e-ac0cd8234475","handle":"qa-306a33f6748e","displayName":"QA 306a33f6748e","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.530607350Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f11ec274-b1eb-4edd-af65-765d8eea7db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f11ec274-b1eb-4edd-af65-765d8eea7db4
Content-Type: application/json

--- request body ---
{"handle":"qa-511a47a3c5eb","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f11ec274-b1eb-4edd-af65-765d8eea7db4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d2e6701-a659-4be1-bbe0-a77dda8fe761"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8dc1f335-ba54-469d-90a9-b87ffa666fa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dc1f335-ba54-469d-90a9-b87ffa666fa7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8226c29c6b7","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dc1f335-ba54-469d-90a9-b87ffa666fa7
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
Location: /v1/conversations/cnv_25287786-91ec-48f6-8e4b-f6d9314df4e7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_25287786-91ec-48f6-8e4b-f6d9314df4e7","subject":"Error contract","status":"open","region":"eu","participants":["qa-511a47a3c5eb","qa-b8226c29c6b7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.601208559Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-be7563fd-d446-4f13-a12f-98fdf1901e9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be7563fd-d446-4f13-a12f-98fdf1901e9d
Content-Type: application/json

--- request body ---
{"handle":"qa-306a33f6748e","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-be7563fd-d446-4f13-a12f-98fdf1901e9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd0a7b1e-72c0-4e7f-b89e-ac0cd8234475"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_25287786-91ec-48f6-8e4b-f6d9314df4e7/read
correlation: qa-985e409b-c91e-42e0-b2f5-8c5ee917119b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-985e409b-c91e-42e0-b2f5-8c5ee917119b
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-985e409b-c91e-42e0-b2f5-8c5ee917119b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_25287786-91ec-48f6-8e4b-f6d9314df4e7/read","correlationId":"qa-985e409b-c91e-42e0-b2f5-8c5ee917119b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab2e36f5-08c5-4a38-9512-a3085196b937

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab2e36f5-08c5-4a38-9512-a3085196b937
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab2e36f5-08c5-4a38-9512-a3085196b937
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
correlation: qa-a31759c8-81ed-479b-92d4-ccf9deef9c9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31759c8-81ed-479b-92d4-ccf9deef9c9e
Content-Type: application/json

--- request body ---
{"handle":"qa-306a33f6748e","password":"****"}

--- response: 401 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a31759c8-81ed-479b-92d4-ccf9deef9c9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a31759c8-81ed-479b-92d4-ccf9deef9c9e"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ce7210ab-2276-4d77-86de-dbe5ed7bf594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce7210ab-2276-4d77-86de-dbe5ed7bf594
Content-Type: application/json

--- request body ---
{"handle":"qa-b8226c29c6b7","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce7210ab-2276-4d77-86de-dbe5ed7bf594
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57a79700-cfaa-4448-8480-412489da2015"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f08357c-78de-41be-8740-aa3edc4ec30b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f08357c-78de-41be-8740-aa3edc4ec30b
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f08357c-78de-41be-8740-aa3edc4ec30b
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
correlation: qa-681ca898-84b3-4402-84de-af796ac863d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-681ca898-84b3-4402-84de-af796ac863d2
Content-Type: application/json

--- request body ---
{"handle":"qa-b8226c29c6b7","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-681ca898-84b3-4402-84de-af796ac863d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-681ca898-84b3-4402-84de-af796ac863d2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68f7b696-0d25-456a-8d60-325f137f4569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f7b696-0d25-456a-8d60-325f137f4569
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68f7b696-0d25-456a-8d60-325f137f4569
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
correlation: qa-84d63e9e-0a86-46b5-8a8c-7e0b2fbc6bd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84d63e9e-0a86-46b5-8a8c-7e0b2fbc6bd7
Content-Type: application/json

--- request body ---
{"handle":"qa-511a47a3c5eb","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84d63e9e-0a86-46b5-8a8c-7e0b2fbc6bd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84d63e9e-0a86-46b5-8a8c-7e0b2fbc6bd7"}
```
