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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-49503c1f-6c8f-4751-9f89-fb384745f638` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-ed156dba-178a-4950-a078-85a35e039193` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-816979bb-7f93-4da3-8670-edd3c69925df` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-49ab3175-8ea8-4caa-a031-a032cc46dd07` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-3f03f311-c384-4275-82c5-94c8fd4e0ef9` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-3a7fbf91-f548-44c3-8726-ad18a508930c` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 9 | `qa-4834bfcd-f492-4c45-9008-054df263cff4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-94f22009-c177-4378-8fc3-7a843ac7d75d` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-46b17d6a-b86a-4ce4-9e94-53caca6666b1` |
| 10 | `POST /v1/auth/token` | 200 | 31 | `qa-ed8df3b2-a4c3-4e05-90e2-1f01142f467a` |
| 11 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-0d067fb1-75c4-4f8c-93fa-b27bb32700b6` |
| 12 | `POST /v1/auth/token` | 401 | 12 | `qa-b8bf3745-0c22-4877-b76a-36fa79a95ddb` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9f65ae25-648d-4273-bcba-45d04e9f5b2b` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-833643e2-2378-4a9e-8c8a-b57e3e0aa330` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49503c1f-6c8f-4751-9f89-fb384745f638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49503c1f-6c8f-4751-9f89-fb384745f638
Content-Type: application/json

--- request body ---
{"handle":"qa-66738dd0358f","displayName":"QA 66738dd0358f","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-49503c1f-6c8f-4751-9f89-fb384745f638
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Location: /v1/accounts/qa-66738dd0358f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fdd2d196-c4fd-4408-99f2-41a1d24eb70a","handle":"qa-66738dd0358f","displayName":"QA 66738dd0358f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.699641956Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ed156dba-178a-4950-a078-85a35e039193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed156dba-178a-4950-a078-85a35e039193
Content-Type: application/json

--- request body ---
{"handle":"qa-623cc956e5a9","displayName":"QA 623cc956e5a9","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed156dba-178a-4950-a078-85a35e039193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-623cc956e5a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7973312-00ac-44c7-a789-ff92abceda35","handle":"qa-623cc956e5a9","displayName":"QA 623cc956e5a9","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.762456287Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-816979bb-7f93-4da3-8670-edd3c69925df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-816979bb-7f93-4da3-8670-edd3c69925df
Content-Type: application/json

--- request body ---
{"handle":"qa-5946ae0d65df","displayName":"QA 5946ae0d65df","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-816979bb-7f93-4da3-8670-edd3c69925df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-5946ae0d65df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79fe51f5-5dfb-410a-abfb-fcc7d8d1e341","handle":"qa-5946ae0d65df","displayName":"QA 5946ae0d65df","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.816306395Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-49ab3175-8ea8-4caa-a031-a032cc46dd07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49ab3175-8ea8-4caa-a031-a032cc46dd07
Content-Type: application/json

--- request body ---
{"handle":"qa-66738dd0358f","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-49ab3175-8ea8-4caa-a031-a032cc46dd07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdd2d196-c4fd-4408-99f2-41a1d24eb70a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3f03f311-c384-4275-82c5-94c8fd4e0ef9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f03f311-c384-4275-82c5-94c8fd4e0ef9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-623cc956e5a9","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f03f311-c384-4275-82c5-94c8fd4e0ef9
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
Location: /v1/conversations/cnv_33cf5005-a95f-403f-95cc-eb035e16da7b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_33cf5005-a95f-403f-95cc-eb035e16da7b","subject":"Error contract","status":"open","region":"eu","participants":["qa-66738dd0358f","qa-623cc956e5a9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.874490147Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3a7fbf91-f548-44c3-8726-ad18a508930c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a7fbf91-f548-44c3-8726-ad18a508930c
Content-Type: application/json

--- request body ---
{"handle":"qa-5946ae0d65df","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a7fbf91-f548-44c3-8726-ad18a508930c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79fe51f5-5dfb-410a-abfb-fcc7d8d1e341"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_33cf5005-a95f-403f-95cc-eb035e16da7b/read
correlation: qa-4834bfcd-f492-4c45-9008-054df263cff4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4834bfcd-f492-4c45-9008-054df263cff4
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4834bfcd-f492-4c45-9008-054df263cff4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_33cf5005-a95f-403f-95cc-eb035e16da7b/read","correlationId":"qa-4834bfcd-f492-4c45-9008-054df263cff4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94f22009-c177-4378-8fc3-7a843ac7d75d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f22009-c177-4378-8fc3-7a843ac7d75d
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94f22009-c177-4378-8fc3-7a843ac7d75d
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
correlation: qa-46b17d6a-b86a-4ce4-9e94-53caca6666b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b17d6a-b86a-4ce4-9e94-53caca6666b1
Content-Type: application/json

--- request body ---
{"handle":"qa-5946ae0d65df","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46b17d6a-b86a-4ce4-9e94-53caca6666b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46b17d6a-b86a-4ce4-9e94-53caca6666b1"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ed8df3b2-a4c3-4e05-90e2-1f01142f467a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed8df3b2-a4c3-4e05-90e2-1f01142f467a
Content-Type: application/json

--- request body ---
{"handle":"qa-623cc956e5a9","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed8df3b2-a4c3-4e05-90e2-1f01142f467a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7973312-00ac-44c7-a789-ff92abceda35"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d067fb1-75c4-4f8c-93fa-b27bb32700b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d067fb1-75c4-4f8c-93fa-b27bb32700b6
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d067fb1-75c4-4f8c-93fa-b27bb32700b6
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
correlation: qa-b8bf3745-0c22-4877-b76a-36fa79a95ddb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8bf3745-0c22-4877-b76a-36fa79a95ddb
Content-Type: application/json

--- request body ---
{"handle":"qa-623cc956e5a9","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8bf3745-0c22-4877-b76a-36fa79a95ddb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8bf3745-0c22-4877-b76a-36fa79a95ddb"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f65ae25-648d-4273-bcba-45d04e9f5b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f65ae25-648d-4273-bcba-45d04e9f5b2b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f65ae25-648d-4273-bcba-45d04e9f5b2b
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
correlation: qa-833643e2-2378-4a9e-8c8a-b57e3e0aa330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-833643e2-2378-4a9e-8c8a-b57e3e0aa330
Content-Type: application/json

--- request body ---
{"handle":"qa-66738dd0358f","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-833643e2-2378-4a9e-8c8a-b57e3e0aa330
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-833643e2-2378-4a9e-8c8a-b57e3e0aa330"}
```
