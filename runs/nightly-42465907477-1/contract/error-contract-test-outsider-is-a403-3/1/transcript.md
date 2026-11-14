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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-548d9011-d756-48a1-9123-edd417e655f7` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-af478d3c-2f4e-470f-bdb9-b726ee248f3f` |
| 3 | `POST /v1/accounts` | 201 | 14 | `qa-0cc9f57a-d695-4011-8299-d8d3bf4c0f67` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-72ea0472-5185-40cc-86c8-c192c6513f30` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-c660791d-32c3-4ae7-abd7-acbc59233760` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-0a64c034-4537-4fdb-9a43-3de8729c59c2` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 13 | `qa-7a801522-cd24-4b8f-821a-1e224ba84632` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-d93a72e3-31b3-4466-b84b-d680aabfcd50` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-c1970cff-37d5-47ce-aff1-919d9e82ddcf` |
| 10 | `POST /v1/auth/token` | 200 | 35 | `qa-61bf8b08-5d53-4d9b-9c75-123ca0becdab` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-aa8de73a-9a67-489d-af33-9babae58bf37` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-d335e6ef-02c3-45fc-b56d-fbb32e929ee8` |
| 13 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-a29d6fa6-9b7a-4d56-b1c6-03bcd3f30f42` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-2d0c7df1-7c99-47b1-9355-81f9be9f4ffb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-548d9011-d756-48a1-9123-edd417e655f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-548d9011-d756-48a1-9123-edd417e655f7
Content-Type: application/json

--- request body ---
{"handle":"qa-160a5b72cd5b","displayName":"QA 160a5b72cd5b","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-548d9011-d756-48a1-9123-edd417e655f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Location: /v1/accounts/qa-160a5b72cd5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_646d6f4e-0b60-4cf3-9173-e917f01b10cb","handle":"qa-160a5b72cd5b","displayName":"QA 160a5b72cd5b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.758941602Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-af478d3c-2f4e-470f-bdb9-b726ee248f3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af478d3c-2f4e-470f-bdb9-b726ee248f3f
Content-Type: application/json

--- request body ---
{"handle":"qa-1fb711efbdec","displayName":"QA 1fb711efbdec","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-af478d3c-2f4e-470f-bdb9-b726ee248f3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Location: /v1/accounts/qa-1fb711efbdec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_088c3bee-dcc7-4d75-b3c4-670474ea54b7","handle":"qa-1fb711efbdec","displayName":"QA 1fb711efbdec","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.813001624Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0cc9f57a-d695-4011-8299-d8d3bf4c0f67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cc9f57a-d695-4011-8299-d8d3bf4c0f67
Content-Type: application/json

--- request body ---
{"handle":"qa-811ac6981b89","displayName":"QA 811ac6981b89","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cc9f57a-d695-4011-8299-d8d3bf4c0f67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 10
Location: /v1/accounts/qa-811ac6981b89
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4944e46e-0d74-4ad8-842e-1328d3d60595","handle":"qa-811ac6981b89","displayName":"QA 811ac6981b89","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.838248998Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-72ea0472-5185-40cc-86c8-c192c6513f30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72ea0472-5185-40cc-86c8-c192c6513f30
Content-Type: application/json

--- request body ---
{"handle":"qa-160a5b72cd5b","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-72ea0472-5185-40cc-86c8-c192c6513f30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_646d6f4e-0b60-4cf3-9173-e917f01b10cb"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c660791d-32c3-4ae7-abd7-acbc59233760

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c660791d-32c3-4ae7-abd7-acbc59233760
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1fb711efbdec","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c660791d-32c3-4ae7-abd7-acbc59233760
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
Location: /v1/conversations/cnv_53d3fb38-e713-4e59-bea1-0ca124ddc084
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53d3fb38-e713-4e59-bea1-0ca124ddc084","subject":"Error contract","status":"open","region":"eu","participants":["qa-160a5b72cd5b","qa-1fb711efbdec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.878075812Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0a64c034-4537-4fdb-9a43-3de8729c59c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a64c034-4537-4fdb-9a43-3de8729c59c2
Content-Type: application/json

--- request body ---
{"handle":"qa-811ac6981b89","password":"****"}

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a64c034-4537-4fdb-9a43-3de8729c59c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4944e46e-0d74-4ad8-842e-1328d3d60595"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_53d3fb38-e713-4e59-bea1-0ca124ddc084/read
correlation: qa-7a801522-cd24-4b8f-821a-1e224ba84632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a801522-cd24-4b8f-821a-1e224ba84632
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a801522-cd24-4b8f-821a-1e224ba84632
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_53d3fb38-e713-4e59-bea1-0ca124ddc084/read","correlationId":"qa-7a801522-cd24-4b8f-821a-1e224ba84632"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d93a72e3-31b3-4466-b84b-d680aabfcd50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d93a72e3-31b3-4466-b84b-d680aabfcd50
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d93a72e3-31b3-4466-b84b-d680aabfcd50
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
correlation: qa-c1970cff-37d5-47ce-aff1-919d9e82ddcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1970cff-37d5-47ce-aff1-919d9e82ddcf
Content-Type: application/json

--- request body ---
{"handle":"qa-811ac6981b89","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1970cff-37d5-47ce-aff1-919d9e82ddcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1970cff-37d5-47ce-aff1-919d9e82ddcf"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-61bf8b08-5d53-4d9b-9c75-123ca0becdab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61bf8b08-5d53-4d9b-9c75-123ca0becdab
Content-Type: application/json

--- request body ---
{"handle":"qa-1fb711efbdec","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-61bf8b08-5d53-4d9b-9c75-123ca0becdab
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_088c3bee-dcc7-4d75-b3c4-670474ea54b7"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa8de73a-9a67-489d-af33-9babae58bf37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa8de73a-9a67-489d-af33-9babae58bf37
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa8de73a-9a67-489d-af33-9babae58bf37
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
correlation: qa-d335e6ef-02c3-45fc-b56d-fbb32e929ee8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d335e6ef-02c3-45fc-b56d-fbb32e929ee8
Content-Type: application/json

--- request body ---
{"handle":"qa-1fb711efbdec","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d335e6ef-02c3-45fc-b56d-fbb32e929ee8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d335e6ef-02c3-45fc-b56d-fbb32e929ee8"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a29d6fa6-9b7a-4d56-b1c6-03bcd3f30f42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a29d6fa6-9b7a-4d56-b1c6-03bcd3f30f42
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a29d6fa6-9b7a-4d56-b1c6-03bcd3f30f42
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
correlation: qa-2d0c7df1-7c99-47b1-9355-81f9be9f4ffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d0c7df1-7c99-47b1-9355-81f9be9f4ffb
Content-Type: application/json

--- request body ---
{"handle":"qa-160a5b72cd5b","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d0c7df1-7c99-47b1-9355-81f9be9f4ffb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d0c7df1-7c99-47b1-9355-81f9be9f4ffb"}
```
